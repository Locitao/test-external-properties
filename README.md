This repository is to demonstrate an issue with reading in external properties in a Spring boot application.
The master branch contains the non-working version, simply using @Value annotations.

To test it, build the jar with "gradle clean shadowJar".

The working version resides in the default-properties branch, which specifically loads an application.properties file from the
same directory as the jar.

To run and test the jar, place it in the root directory.
