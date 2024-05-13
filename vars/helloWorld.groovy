def call(Map config = [:]) {
    sh "echo Hi there ${config.name} from szairi2011 GH repo. Today is ${config.dayOfWeek}."
}
