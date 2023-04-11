def call(String imageName, String jibConfigPath) {
    def builder = new org.example.JibImageBuilder(imageName, jibConfigPath)
    builder.build()
}