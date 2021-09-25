/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Datatypes;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class MessageHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3770081392904310265L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"MessageHeader\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"protocol\",\"type\":\"int\"},{\"name\":\"messageType\",\"type\":\"int\"},{\"name\":\"correlationId\",\"type\":\"long\"},{\"name\":\"messageId\",\"type\":\"long\"},{\"name\":\"messageFlags\",\"type\":\"int\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.MessageHeader\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<MessageHeader> ENCODER =
      new BinaryMessageEncoder<MessageHeader>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<MessageHeader> DECODER =
      new BinaryMessageDecoder<MessageHeader>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<MessageHeader> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<MessageHeader> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<MessageHeader> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<MessageHeader>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this MessageHeader to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a MessageHeader from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a MessageHeader instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static MessageHeader fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private int protocol;
   private int messageType;
   private long correlationId;
   private long messageId;
   private int messageFlags;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public MessageHeader() {}

  /**
   * All-args constructor.
   * @param protocol The new value for protocol
   * @param messageType The new value for messageType
   * @param correlationId The new value for correlationId
   * @param messageId The new value for messageId
   * @param messageFlags The new value for messageFlags
   */
  public MessageHeader(java.lang.Integer protocol, java.lang.Integer messageType, java.lang.Long correlationId, java.lang.Long messageId, java.lang.Integer messageFlags) {
    this.protocol = protocol;
    this.messageType = messageType;
    this.correlationId = correlationId;
    this.messageId = messageId;
    this.messageFlags = messageFlags;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return protocol;
    case 1: return messageType;
    case 2: return correlationId;
    case 3: return messageId;
    case 4: return messageFlags;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: protocol = (java.lang.Integer)value$; break;
    case 1: messageType = (java.lang.Integer)value$; break;
    case 2: correlationId = (java.lang.Long)value$; break;
    case 3: messageId = (java.lang.Long)value$; break;
    case 4: messageFlags = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'protocol' field.
   * @return The value of the 'protocol' field.
   */
  public int getProtocol() {
    return protocol;
  }


  /**
   * Sets the value of the 'protocol' field.
   * @param value the value to set.
   */
  public void setProtocol(int value) {
    this.protocol = value;
  }

  /**
   * Gets the value of the 'messageType' field.
   * @return The value of the 'messageType' field.
   */
  public int getMessageType() {
    return messageType;
  }


  /**
   * Sets the value of the 'messageType' field.
   * @param value the value to set.
   */
  public void setMessageType(int value) {
    this.messageType = value;
  }

  /**
   * Gets the value of the 'correlationId' field.
   * @return The value of the 'correlationId' field.
   */
  public long getCorrelationId() {
    return correlationId;
  }


  /**
   * Sets the value of the 'correlationId' field.
   * @param value the value to set.
   */
  public void setCorrelationId(long value) {
    this.correlationId = value;
  }

  /**
   * Gets the value of the 'messageId' field.
   * @return The value of the 'messageId' field.
   */
  public long getMessageId() {
    return messageId;
  }


  /**
   * Sets the value of the 'messageId' field.
   * @param value the value to set.
   */
  public void setMessageId(long value) {
    this.messageId = value;
  }

  /**
   * Gets the value of the 'messageFlags' field.
   * @return The value of the 'messageFlags' field.
   */
  public int getMessageFlags() {
    return messageFlags;
  }


  /**
   * Sets the value of the 'messageFlags' field.
   * @param value the value to set.
   */
  public void setMessageFlags(int value) {
    this.messageFlags = value;
  }

  /**
   * Creates a new MessageHeader RecordBuilder.
   * @return A new MessageHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.MessageHeader.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.MessageHeader.Builder();
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.MessageHeader.Builder newBuilder(Energistics.Etp.v12.Datatypes.MessageHeader.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.MessageHeader.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.MessageHeader.Builder(other);
    }
  }

  /**
   * Creates a new MessageHeader RecordBuilder by copying an existing MessageHeader instance.
   * @param other The existing instance to copy.
   * @return A new MessageHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.MessageHeader.Builder newBuilder(Energistics.Etp.v12.Datatypes.MessageHeader other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.MessageHeader.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.MessageHeader.Builder(other);
    }
  }

  /**
   * RecordBuilder for MessageHeader instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<MessageHeader>
    implements org.apache.avro.data.RecordBuilder<MessageHeader> {

    private int protocol;
    private int messageType;
    private long correlationId;
    private long messageId;
    private int messageFlags;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.MessageHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.protocol)) {
        this.protocol = data().deepCopy(fields()[0].schema(), other.protocol);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.messageType)) {
        this.messageType = data().deepCopy(fields()[1].schema(), other.messageType);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[2].schema(), other.correlationId);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.messageId)) {
        this.messageId = data().deepCopy(fields()[3].schema(), other.messageId);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.messageFlags)) {
        this.messageFlags = data().deepCopy(fields()[4].schema(), other.messageFlags);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
    }

    /**
     * Creates a Builder by copying an existing MessageHeader instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.MessageHeader other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.protocol)) {
        this.protocol = data().deepCopy(fields()[0].schema(), other.protocol);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.messageType)) {
        this.messageType = data().deepCopy(fields()[1].schema(), other.messageType);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.correlationId)) {
        this.correlationId = data().deepCopy(fields()[2].schema(), other.correlationId);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.messageId)) {
        this.messageId = data().deepCopy(fields()[3].schema(), other.messageId);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.messageFlags)) {
        this.messageFlags = data().deepCopy(fields()[4].schema(), other.messageFlags);
        fieldSetFlags()[4] = true;
      }
    }

    /**
      * Gets the value of the 'protocol' field.
      * @return The value.
      */
    public int getProtocol() {
      return protocol;
    }


    /**
      * Sets the value of the 'protocol' field.
      * @param value The value of 'protocol'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder setProtocol(int value) {
      validate(fields()[0], value);
      this.protocol = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'protocol' field has been set.
      * @return True if the 'protocol' field has been set, false otherwise.
      */
    public boolean hasProtocol() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'protocol' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder clearProtocol() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'messageType' field.
      * @return The value.
      */
    public int getMessageType() {
      return messageType;
    }


    /**
      * Sets the value of the 'messageType' field.
      * @param value The value of 'messageType'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder setMessageType(int value) {
      validate(fields()[1], value);
      this.messageType = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'messageType' field has been set.
      * @return True if the 'messageType' field has been set, false otherwise.
      */
    public boolean hasMessageType() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'messageType' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder clearMessageType() {
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'correlationId' field.
      * @return The value.
      */
    public long getCorrelationId() {
      return correlationId;
    }


    /**
      * Sets the value of the 'correlationId' field.
      * @param value The value of 'correlationId'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder setCorrelationId(long value) {
      validate(fields()[2], value);
      this.correlationId = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'correlationId' field has been set.
      * @return True if the 'correlationId' field has been set, false otherwise.
      */
    public boolean hasCorrelationId() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'correlationId' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder clearCorrelationId() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'messageId' field.
      * @return The value.
      */
    public long getMessageId() {
      return messageId;
    }


    /**
      * Sets the value of the 'messageId' field.
      * @param value The value of 'messageId'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder setMessageId(long value) {
      validate(fields()[3], value);
      this.messageId = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'messageId' field has been set.
      * @return True if the 'messageId' field has been set, false otherwise.
      */
    public boolean hasMessageId() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'messageId' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder clearMessageId() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'messageFlags' field.
      * @return The value.
      */
    public int getMessageFlags() {
      return messageFlags;
    }


    /**
      * Sets the value of the 'messageFlags' field.
      * @param value The value of 'messageFlags'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder setMessageFlags(int value) {
      validate(fields()[4], value);
      this.messageFlags = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'messageFlags' field has been set.
      * @return True if the 'messageFlags' field has been set, false otherwise.
      */
    public boolean hasMessageFlags() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'messageFlags' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.MessageHeader.Builder clearMessageFlags() {
      fieldSetFlags()[4] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public MessageHeader build() {
      try {
        MessageHeader record = new MessageHeader();
        record.protocol = fieldSetFlags()[0] ? this.protocol : (java.lang.Integer) defaultValue(fields()[0]);
        record.messageType = fieldSetFlags()[1] ? this.messageType : (java.lang.Integer) defaultValue(fields()[1]);
        record.correlationId = fieldSetFlags()[2] ? this.correlationId : (java.lang.Long) defaultValue(fields()[2]);
        record.messageId = fieldSetFlags()[3] ? this.messageId : (java.lang.Long) defaultValue(fields()[3]);
        record.messageFlags = fieldSetFlags()[4] ? this.messageFlags : (java.lang.Integer) defaultValue(fields()[4]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<MessageHeader>
    WRITER$ = (org.apache.avro.io.DatumWriter<MessageHeader>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<MessageHeader>
    READER$ = (org.apache.avro.io.DatumReader<MessageHeader>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeInt(this.protocol);

    out.writeInt(this.messageType);

    out.writeLong(this.correlationId);

    out.writeLong(this.messageId);

    out.writeInt(this.messageFlags);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.protocol = in.readInt();

      this.messageType = in.readInt();

      this.correlationId = in.readLong();

      this.messageId = in.readLong();

      this.messageFlags = in.readInt();

    } else {
      for (int i = 0; i < 5; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.protocol = in.readInt();
          break;

        case 1:
          this.messageType = in.readInt();
          break;

        case 2:
          this.correlationId = in.readLong();
          break;

        case 3:
          this.messageId = in.readLong();
          break;

        case 4:
          this.messageFlags = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










