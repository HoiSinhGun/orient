package com.c72g.exploring.info;

import javax.sound.sampled.Line;

public class InformationBuilder {


        private Information instance = new Information();


/*
        public static InformationBuilder newBuilder() {
            return new InformationBuilder();
        }
*/

        public InformationBuilder header(String header) {
            instance.setHeader(header);
            return this;
        }

        public InformationBuilder content(String content) {
            instance.setContent(content);
            return this;
        }

        public InformationBuilder footer(String footer) {
            instance.setFooter(footer);
            return this;
        }

        public Information toInformation() {
            return instance;
        }
}
