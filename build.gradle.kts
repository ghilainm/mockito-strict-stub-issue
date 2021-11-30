plugins {
	`java-library`
}

group = "com.poppy"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.mockito:mockito-core:4.1.0")
	testImplementation("org.mockito:mockito-junit-jupiter:4.1.0")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.test {
	useJUnitPlatform()
}
