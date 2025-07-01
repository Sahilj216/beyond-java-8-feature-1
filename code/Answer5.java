public class Answer5 {

    public static void main(String[] args) {
        // Question: Demonstrate the use of 
        // repeat(), strip(),trim(), isBlank(), indent(), transform(), stripIndent(), translateEscapes(),tripleQuotes and formatted() methods.
        String text = "  Hello, World!";

        // repeat()
        String repeated = text.repeat(2);
        System.out.println("Repeated: " + repeated); // output: "  Hello, World!  Hello, World!"


        // strip()
        String stripped = text.strip();
        System.out.println("Stripped: '" + stripped + "'"); // output: "Hello, World!"

        // trim()
        String trimmed = text.trim();
        System.out.println("Trimmed: '" + trimmed + "'"); // output: "Hello, World!"
        
        // isBlank()
        boolean isBlank = text.isBlank();
        System.out.println("Is Blank: " + isBlank); // output: false

        // indent()
        String indented = text.indent(4);
        System.out.println("Indented: '" + indented + "'"); // output: "    Hello, World!"

        // transform()
        String transformed = text.transform(String::toUpperCase);
        System.out.println("Transformed: '" + transformed + "'"); // output: "  HELLO, WORLD!"

        // stripIndent()
        String indentedText = "    Hello, World!";
        String strippedIndent = indentedText.stripIndent();
        System.out.println("Stripped Indent: '" + strippedIndent + "'"); // output: "Hello, World!"
        
        // translateEscapes()
        String escapeText = "Hello\\nWorld\\t!";
        String translated = escapeText.translateEscapes();
        System.out.println("Translated Escapes: '" + translated + "'");
        
        // tripleQuotes
        String tripleQuoted = """
                This is a triple quoted string.
                It can span multiple lines.
                """;
        System.out.println("Triple Quoted: " + tripleQuoted); 
        
        // formatted()
        String formatted = "Hello, %s!".formatted("World");
        System.out.println("Formatted: " + formatted); // output: "Hello, World!"
        
    }
}
