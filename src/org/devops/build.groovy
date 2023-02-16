package org.devops


def build(buildType,buildShell){
    def buildTools=["mvn":"MVN","npm":"NPM"]
    buildHome=tool buildTools[buildType]
    sh "${buildHome}/bin/${buildType} ${buildShell}"
}
