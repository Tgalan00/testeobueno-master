object Hanged : Picture() {

    fun printHanged () {

        val paint = "                                                                                \n" +
                "                      /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n" +
                "                      /@*                           @@,                      @@ \n" +
                "                      /@*                             @@@                    @@ \n" +
                "                      /@*                                @@*                 @@ \n" +
                "                      /@*                                  @@@               @@ \n" +
                "                      /@*                                    .@@/            @@ \n" +
                "                      /@*                                       @@@          @@ \n" +
                "                    @@@@@@#                                       .@@(       @@ \n" +
                "                @@@.       *@@@                                      @@@     @@ \n" +
                "              (@/   %    .%   @@*                                       @@#  @@ \n" +
                "             @@    @@@  #@@@   @@                                         @@@@@ \n" +
                "             @@                 @@                                           @@ \n" +
                "              @@               @@                                            @@ \n" +
                "               @@#@@&     &@ @@@                                             @@ \n" +
                "                 *@@@@@@@@@@@                                                @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                     ,@@@,                                                   @@ \n" +
                "                   @@@/@*@@@                                                 @@ \n" +
                "                *@@,  /@*  ,@@                                               @@ \n" +
                "              @@@     /@*     @@%                                            @@ \n" +
                "           *@@,       /@*       %@@                                          @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                      @@&                                                    @@ \n" +
                "                    .@@ @@                                                   @@ \n" +
                "                   @@,   @@@                                                 @@ \n" +
                "                 *@@       @@                                                @@ \n" +
                "                @@          @@%                                              @@ \n" +
                "              (@@             @@                                             @@ \n" +
                "              &                @/                                            @@ \n" +
                "                                                                             @@ \n" +
                "                                                                             @@ \n" +
                "                                                                             @@\n"
        paint.forEach {
            print(it)
            if (it == '\n')
                Thread.sleep(100)
        }
    }
}