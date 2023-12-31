package zoologico

class Leao(val nome: String?): Animal {
    override fun emitirSom(): String {
        return "O leão está emitindo um rugido!"
    }

    override fun mover(): String {
        return "O leão está se movendo!"
    }

    fun rugir(): String {
        return "Rooooaaaar!"
    }
}