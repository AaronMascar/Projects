import face_recognition

# In this section we will be loading the main elements of the pictures.
# This section loads all the pictures saved in the peoples library.
image_of_Paul_Walker = face_recognition.load_image_file("Paul Walker.jpg")
image_of_Tyrese_Gibson = face_recognition.load_image_file("Tyrese Gibson.jpg")
image_of_Dwayne_Johnson = face_recognition.load_image_file("Dwayne Johnson.jpg")

# In this section each of the pictures of the people are gridded. The face detection algorithm will
# develop a face grid and save the coordinates in the temp memory allocation. Each face gets a mathematical
# grid and these values are stored and used on later instances.
Paul_Walker_face_encoding = face_recognition.face_encodings(image_of_Paul_Walker)[0]
Tyrese_Gibson_face_encoding = face_recognition.face_encodings(image_of_Tyrese_Gibson)[0]
Dwayne_Johnson_face_encoding = face_recognition.face_encodings(image_of_Dwayne_Johnson)[0]

# This section saves all the mathematical grids in the temp memory
known_face_encodings = [
    Paul_Walker_face_encoding,
    Tyrese_Gibson_face_encoding,
    Dwayne_Johnson_face_encoding
]

# This section loads the selected test image and loads the face detection library and uses the
# grid system to match the existing algorithm to the face detections in the test image.
unknown_image = face_recognition.load_image_file("unknown_1.jpg")

# This section looks into loading the test image into the face recognition library
# and loads the mathematical algorithm for the faces and tries matching the faces with the
# mathematical values present in the library.
unknown_face_encodings = face_recognition.face_encodings(unknown_image)

# As the image can consist of multiples faces its important to loop the program till all the faces have
# been matched or each face has gone through the library to try matching them with the temp maths library.
for unknown_face_encoding in unknown_face_encodings:

    # In some situations we might have faces in the test image where the program cannot identify
    # them or these faces are not present in the maths library. So its will output unknown in the result window.
    results = face_recognition.compare_faces(known_face_encodings, unknown_face_encoding, tolerance=0.6)

    name = "Unknown"

    if results[0]:
        name = "Paul Walker"
    elif results[1]:
        name = "Tyrese Gibson"
    elif results[2]:
        name = "Dwayne Johnson"

    print(f"Found {name} in the photo!")
