javac -d classes/ ../src/ru/ifmo/se/lab3/enums/*
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab3/characters/*
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab3/objects/*.java
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab3/objects/nature/*
javac -cp ".:../src" -d classes/ ../src/ru/ifmo/se/lab3/*.java


jar cvmf MANIFEST.MF lab3.jar -C classes/ .
