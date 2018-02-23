module org.jgrapht.demo
{
    requires java.desktop;

    requires org.jgrapht.core;
    requires org.jgrapht.io;
    requires org.jgrapht.ext;

    // XXX: This is a filename-based automatic module, but unfortunately the jgraph project
    //      will never be releasing a new version.
    requires jgraph;

    // XXX: This is a filename-based automatic module, and MUST be replaced with a reference
    //      to an Automatic-Module-Name.
    // See: https://github.com/jgraph/jgraphx/issues/91
    requires jgraphx;

    exports org.jgrapht.demo;
}