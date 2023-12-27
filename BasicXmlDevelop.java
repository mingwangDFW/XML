
public class BasicXmlDevelop{

    public static void BasicXmlDevelop(Strings[] args){
        XmlReader xmlReader = new XmlReader();

        if (xmlReader.readXML("input.xml")) {
            // Successfully read the XML file
            System.out.println("Roles from input.xml:");
            for (String role : xmlReader.getRoles()) {
                System.out.println(role);
            }
        }else {
            System.out.println("Failed to read the XML file.");
        }
        
        xmlReader.saveToXML("output.xml");
        System.out.println("Data saved to output.xml.");

    }


}