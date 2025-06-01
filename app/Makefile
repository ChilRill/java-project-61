setup:
	chmod +x code/app/gradlew && cd code/app && ./gradlew clean install
install-dist:
	gradlew.bat installDist
run-dist: install-dist
	"build/install/app/bin/app.bat"