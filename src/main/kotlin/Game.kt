class Game(wordefaultorfriend: Int, dif: Int) {

    val hangman: Hangman

    init {
        val defaultlist = listOf<List<Char>>(listOf('c','l','a','s','e'),
            listOf('p','a','t','a','t','a'),
            listOf('c','i','e','l','o'),
            listOf('c','u','a','d','r','o'),
            listOf('o','c','e','a','n','o'),
            listOf('m','a','r','a','v','i','l','l','o','s','o'),
            listOf('e','j','e','r','c','i','c','i','o'),
            listOf('p','i','a','n','o'),
            listOf('a','p','r','o','v','a','d','o'),
            listOf('p','r','o','g','r','a','m','a','r'),
            listOf('k','o','t','l','i','n')
        )

        if (dif == 1 && wordefaultorfriend == 1) {

            printProcedure()
            hangman = Hangman(6, defaultlist.random())

        }else if (dif == 2 && wordefaultorfriend == 1) {
            printProcedure()
            hangman = Hangman(5, defaultlist.random())
        } else if (dif == 3 && wordefaultorfriend == 1) {
            printProcedure()
            hangman = Hangman(4, defaultlist.random())
        } else if (dif == 1 && wordefaultorfriend == 2) {
            printProcedure()
            hangman = Hangman(6,palabraCompanero(), arrayListOf())
        }else if (dif == 2 && wordefaultorfriend == 2) {
            printProcedure()
            hangman = Hangman(5,palabraCompanero(), arrayListOf())
        }else {
            printProcedure()
            hangman = Hangman(4,palabraCompanero(), arrayListOf())
        }
    }
}