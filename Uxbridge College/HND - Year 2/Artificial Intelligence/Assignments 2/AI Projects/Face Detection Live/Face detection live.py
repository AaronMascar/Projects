import face_recognition
import cv2


# Get a reference to webcam #0 (the default one)
video_capture = cv2.VideoCapture(0)

aaron_image = face_recognition.load_image_file("aaron.jpg")
aaron_face_encoding = face_recognition.face_encodings(aaron_image)[0]

vishy_image = face_recognition.load_image_file("vishy.jpg")
vishy_face_encoding = face_recognition.face_encodings(vishy_image)[0]

aiden_image = face_recognition.load_image_file("aiden.jpg")
aiden_face_encoding = face_recognition.face_encodings(aiden_image)[0]

adrain_image = face_recognition.load_image_file("adrain.jpg")
adrain_face_encoding = face_recognition.face_encodings(adrain_image)[0]

osric_image = face_recognition.load_image_file("osric.jpg")
osric_face_encoding = face_recognition.face_encodings(osric_image)[0]

Keanu_image = face_recognition.load_image_file("Keanu Reaves.jpg")
Keanu_face_encoding = face_recognition.face_encodings(Keanu_image)[0]

Dwayne_image = face_recognition.load_image_file("Dwayne Johnson.jpg")
Dwayne_face_encoding = face_recognition.face_encodings(Dwayne_image)[0]

Paul_image = face_recognition.load_image_file("Paul Walker.jpg")
Paul_face_encoding = face_recognition.face_encodings(Paul_image)[0]

# Create arrays of known face encodings and their names
known_face_encodings = [

    aaron_face_encoding,
    vishy_face_encoding,
    aiden_face_encoding,
    adrain_face_encoding,
    osric_face_encoding,
    Keanu_face_encoding,
    Dwayne_face_encoding,
    Paul_face_encoding,

]
known_face_names = [

    "aaron",
    "vishy",
    "aiden",
    "adrain",
    "osric",
    "Keanu Reaves",
    "Dwayne",
    "Paul",

]

while True:
    # Grab a single frame of video
    ret, frame = video_capture.read()

    # Convert the image from BGR color (which OpenCV uses) to RGB color (which face_recognition uses)
    rgb_frame = frame[: , : , : :-1]

    # Find all the faces and face encodings in the frame of video
    face_locations = face_recognition.face_locations(rgb_frame)
    face_encodings = face_recognition.face_encodings(rgb_frame, face_locations)

    # Loop through each face in this frame of video
    for (top, right, bottom, left), face_encoding in zip(face_locations, face_encodings):
        # See if the face is a match for the known face(s)
        matches = face_recognition.compare_faces(known_face_encodings, face_encoding)

        name = "Unknown face"

        # If a match was found in known_face_encodings, just use the first one.
        if True in matches:
            first_match_index = matches.index(True)
            name = known_face_names[first_match_index]

        # Draw a box around the face
        cv2.rectangle(frame, (left, top), (right, bottom), (0, 0, 255), 2)

        # Draw a label with a name below the face
        cv2.rectangle(frame, (left, bottom - 35), (right, bottom), (0, 0, 255), cv2.FILLED)
        font = cv2.FONT_HERSHEY_DUPLEX
        cv2.putText(frame, name, (left + 6, bottom - 6), font, 1.0, (255, 255, 255), 1)

    # Display the resulting image
    cv2.imshow('Video', frame)

    # Hit 'q' on the keyboard to quit!
    if cv2.waitKey(1) & 0xFF == ord('q'):
        break

# Release handle to the webcam
video_capture.release()
cv2.destroyAllWindows()
