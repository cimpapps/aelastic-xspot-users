package com.aelastic.xspot.users.models.serdes;

import com.aelastic.xspot.users.models.documents.UserDocument;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serializer;

import java.util.Map;

public class UserDocumentSerde implements Serde<UserDocument> {
    @Override
    public void configure(Map<String, ?> map, boolean b) {

    }

    @Override
    public void close() {

    }

    @Override
    public Serializer<UserDocument> serializer() {
        return null;
    }

    @Override
    public Deserializer<UserDocument> deserializer() {
        return null;
    }
}
