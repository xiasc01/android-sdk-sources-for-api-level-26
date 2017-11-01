
/*
This Java source file was generated by test-to-java.xsl
and is a derived work from the source document.
The source document contained the following notice:


Copyright (c) 2001-2003 World Wide Web Consortium,
(Massachusetts Institute of Technology, Institut National de
Recherche en Informatique et en Automatique, Keio University). All
Rights Reserved. This program is distributed under the W3C's Software
Intellectual Property License. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even
the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
PURPOSE.
See W3C License http://www.w3.org/Consortium/Legal/ for more details.

*/

package org.w3c.domts.level1.core;

import org.w3c.dom.*;


import org.w3c.domts.DOMTestCase;
import org.w3c.domts.DOMTestDocumentBuilderFactory;



/**
 *     
 *     The "getChildNodes()" method returns a NodeList
 *     that contains all children of this node. 
 *     
 *     Retrieve the second employee and check the NodeList
 *     returned by the "getChildNodes()" method.   The
 *     length of the list should be 13.
* @author Curt Arnold
* @see <a href="http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-1451460987">http://www.w3.org/TR/1998/REC-DOM-Level-1-19981001/level-one-core#ID-1451460987</a>
* @see <a href="http://www.w3.org/Bugs/Public/show_bug.cgi?id=246">http://www.w3.org/Bugs/Public/show_bug.cgi?id=246</a>
*/
public final class hc_nodechildnodes extends DOMTestCase {

   /**
    * Constructor.
    * @param factory document factory, may not be null
    * @throws org.w3c.domts.DOMTestIncompatibleException Thrown if test is not compatible with parser configuration
    */
   public hc_nodechildnodes(final DOMTestDocumentBuilderFactory factory)  throws org.w3c.domts.DOMTestIncompatibleException {
      super(factory);

    //
    //   check if loaded documents are supported for content type
    //
    String contentType = getContentType();
    preload(contentType, "hc_staff", false);
    }

   /**
    * Runs the test case.
    * @throws Throwable Any uncaught exception causes test to fail
    */
   public void runTest() throws Throwable {
      Document doc;
      NodeList elementList;
      Node employeeNode;
      Node childNode;
      NodeList childNodes;
      int nodeType;
      String childName;
      java.util.List actual = new java.util.ArrayList();
      
      java.util.List expected = new java.util.ArrayList();
      expected.add("em");
      expected.add("strong");
      expected.add("code");
      expected.add("sup");
      expected.add("var");
      expected.add("acronym");
      
      doc = (Document) load("hc_staff", false);
      elementList = doc.getElementsByTagName("p");
      employeeNode = elementList.item(1);
      childNodes = employeeNode.getChildNodes();
      for (int indexN1006C = 0; indexN1006C < childNodes.getLength(); indexN1006C++) {
          childNode = (Node) childNodes.item(indexN1006C);
    nodeType = (int) childNode.getNodeType();
      childName = childNode.getNodeName();
      
      if (equals(1, nodeType)) {
          actual.add(childName);
      } else {
          assertEquals("textNodeType", 3, nodeType);
      }
        
      }
      assertEqualsAutoCase("element", "elementNames", expected, actual);
        }
   /**
    *  Gets URI that identifies the test.
    *  @return uri identifier of test
    */
   public String getTargetURI() {
      return "http://www.w3.org/2001/DOM-Test-Suite/level1/core/hc_nodechildnodes";
   }
   /**
    * Runs this test from the command line.
    * @param args command line arguments
    */
   public static void main(final String[] args) {
        DOMTestCase.doMain(hc_nodechildnodes.class, args);
   }
}

