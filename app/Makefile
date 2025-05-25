setup:
	cd code/app && chmod +x ./gradlew && ./gradlew clean install
install-dist:
	gradlew installDist
run-dist: install-dist
	"build/install/app/bin/app.bat"