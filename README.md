# DModuleArchetype

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.devocative/dmodule-archetype/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.devocative/dmodule-archetype)

A Maven archetype to create initial project for a DModule

Just execute the following command:
```shell
mvn -B archetype:generate \
	-DarchetypeGroupId=org.devocative \
	-DarchetypeArtifactId=dmodule-archetype \
	-DarchetypeVersion=1.0 \
	-DgroupId=? \
	-DartifactId=? \
	-Dversion=1.0-SNAPSHOT \
	-Dpackage=? \
	-DModuleName=? \
	-DModuleShortName=?
```

**Note**: the value for `ModuleShortName` must be in capital form, and exactly have length of 3 characters!

This is the command for [Store example](https://github.com/mbizhani/Demeter):
```shell
mvn -B archetype:generate \
	-DarchetypeGroupId=org.devocative \
	-DarchetypeArtifactId=dmodule-archetype \
	-DarchetypeVersion=1.0 \
	-DgroupId=my.pkg \
	-DartifactId=store \
	-Dversion=1.0-SNAPSHOT \
	-Dpackage=my.pkg.store \
	-DModuleName=Store \
	-DModuleShortName=STR
```
