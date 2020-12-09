/*
 * @test /nodynamiccopyright/
 * @bug 8256312
 * @summary Valid anchor 'id' value not allowed
 * @modules jdk.javadoc/jdk.javadoc.internal.doclint
 * @build DocLintTester
 * @run main DocLintTester -XhtmlVersion:html5 -ref AnchorTest5.out AnchorTest5.java
 */

/** */
public class AnchorTest5 {
    /**
     * <a id=123 ></a>
     */
    public void a_id_valid() { }

    /**
     * <a id="123 "></a>
     */
    public void a_id_invalid() { }

    /**
     * <a id=&#x2615></a>
     */
    public void a_id_valid_characters() { }

    /**
     * <p id=123 >text</p>
     */
    public void p_id_already_defined() { }

}
