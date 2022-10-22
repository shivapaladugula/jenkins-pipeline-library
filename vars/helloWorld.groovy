def call(String name, String dayOfwWeek) {
  sh "echo hello $(name). Today is $(dayOfWeek)."
}
