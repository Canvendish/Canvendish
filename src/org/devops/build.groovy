package org.devops


def build(buildType,buildShell){
    def buildTools=["mvn":"MVN","npm":"NPM"]
    buildHome=tool buildTools[buildType]
    if ("${buildType}" == "npm"){
        
        sh  """ 
            export NODE_HOME=${buildHome} 
            export PATH=\$NODE_HOME/bin:\$PATH 
            ${buildHome}/bin/${buildType} ${buildShell}"""
    } else {
        sh "${buildHome}/bin/${buildType}  ${buildShell}"
    }
}
