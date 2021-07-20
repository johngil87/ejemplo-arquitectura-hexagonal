module org.example.infrastructure {
    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires org.example.domain;
    requires orx.example.application;

    exports infrastructurbook;
}