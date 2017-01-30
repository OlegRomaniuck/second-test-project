package property.tools;


import java.awt.*;
import java.awt.datatransfer.*;

public final class Tool_Clipboard implements ClipboardOwner {

    /**
     * Empty implementation of the ClipboardOwner interface.
     */
    @Override
    public void lostOwnership(Clipboard aClipboard, Transferable aContents) {
       
    }

    /**
     * Place a String on the clipboard, and make this class the
     * owner of the Clipboard's contents.
     */
    public void SET(String aString) {
        StringSelection stringSelection = new StringSelection(aString);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, this);
    }

    /**
     * Get the String residing on the clipboard.
     *
     * @return any text found on the Clipboard;
     * if none found, return an empty String.
     */
    public String GET() {
        String result = "";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        //odd: the Object param of getContents is not currently used
        Transferable contents = clipboard.getContents(null);
        boolean hasTransferableText =
                (contents != null) &&
                        contents.isDataFlavorSupported(DataFlavor.stringFlavor);
        if (hasTransferableText) {
            try {
                result = (String) contents.getTransferData(DataFlavor.stringFlavor);
            } catch (Exception ex) {
                System.out.println(ex);
                ex.printStackTrace();
            }
        }
        return result;
    }
}
