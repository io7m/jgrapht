module org.jgrapht.io
{
    requires java.xml;

    requires org.apache.commons.lang3;
    requires org.jgrapht.core;

    // XXX: This *must* be replaced with the correct Automatic-Module-Name ("org.antlr.antlr4.runtime") before any
    //      release is made.
    // See: https://github.com/antlr/antlr4/pull/2223
    requires antlr4.runtime;

    exports org.jgrapht.io;
}