public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            throw new IllegalArgumentException(
                "informe dois arquivos de entrada. Ex.: java Main ../dados/arvore1.txt ../dados/arvore2.txt"
            );
        }

        Graph tree1 = new Graph(new In(args[0]));
        Graph tree2 = new Graph(new In(args[1]));

        StdOut.println("Arvore 1:");
        StdOut.println(tree1);
        StdOut.println();

        StdOut.println("Arvore 2:");
        StdOut.println(tree2);
        StdOut.println();

        TreeIsomorphism analysis1 = new TreeIsomorphism(tree1);
        TreeIsomorphism analysis2 = new TreeIsomorphism(tree2);

        // VALIDACAO
        StdOut.println("Validacao Arvore 1:");
        StdOut.println(analysis1.getValidationMessage());
        StdOut.println();

        StdOut.println("Validacao Arvore 2:");
        StdOut.println(analysis2.getValidationMessage());
        StdOut.println();

        if (!analysis1.isTree() || !analysis2.isTree()) {
            StdOut.println("Comparacao interrompida: uma das entradas nao eh uma arvore.");
            return;
        }

        // CENTROS
        StdOut.println("Centros Arvore 1:");
        for (int c : analysis1.getCenters()) {
            StdOut.print(c + " ");
        }
        StdOut.println("\n");

        StdOut.println("Centros Arvore 2:");
        for (int c : analysis2.getCenters()) {
            StdOut.print(c + " ");
        }
        StdOut.println("\n");

        // CODIFICACAO
        String code1 = analysis1.getCanonicalEncoding();
        String code2 = analysis2.getCanonicalEncoding();

        StdOut.println("Codificacao Arvore 1:");
        StdOut.println(code1);
        StdOut.println();

        StdOut.println("Codificacao Arvore 2:");
        StdOut.println(code2);
        StdOut.println();

        // RESULTADO
        if (code1.equals(code2)) {
            StdOut.println("Resultado: Arvores ISOMORFAS");
        } else {
            StdOut.println("Resultado: Arvores NAO ISOMORFAS");
        }
    }
}