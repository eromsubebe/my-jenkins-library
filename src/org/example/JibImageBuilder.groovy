package org.example

class JibImageBuilder {
    def imageName
    def jibConfigPath
    
    JibImageBuilder(String imageName, String jibConfigPath) {
        this.imageName = imageName
        this.jibConfigPath = jibConfigPath
    }
    
    void build() {
        sh "jib --image ${imageName} --config ${jibConfigPath}"
    }
}