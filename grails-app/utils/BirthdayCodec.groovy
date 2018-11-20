import infra.cloud.backend.Birthday
import org.bson.BsonReader
import org.bson.BsonWriter
import org.bson.codecs.Codec
import org.bson.codecs.DecoderContext
import org.bson.codecs.EncoderContext

class BirthdayCodec implements Codec<Birthday> {
    @Override
    Birthday decode(BsonReader reader, DecoderContext decoderContext) {
        return new Birthday(date: new Date(reader.readDateTime()))
    }

    @Override
    void encode(BsonWriter writer, Birthday value, EncoderContext encoderContext) {
        writer.writeDateTime(value.date.time)
    }

    @Override
    Class<Birthday> getEncoderClass() {
        return Birthday
    }
}
