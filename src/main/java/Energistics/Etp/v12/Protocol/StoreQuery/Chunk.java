/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.StoreQuery;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class Chunk extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 5603861613727291903L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Chunk\",\"namespace\":\"Energistics.Etp.v12.Protocol.StoreQuery\",\"fields\":[{\"name\":\"blobId\",\"type\":{\"type\":\"fixed\",\"name\":\"Uuid\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"size\":16,\"fullName\":\"Energistics.Etp.v12.Datatypes.Uuid\",\"depends\":[]}},{\"name\":\"data\",\"type\":\"bytes\"},{\"name\":\"final\",\"type\":\"boolean\"}],\"protocol\":\"14\",\"messageType\":\"3\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":true,\"fullName\":\"Energistics.Etp.v12.Protocol.StoreQuery.Chunk\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Uuid\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Chunk> ENCODER =
      new BinaryMessageEncoder<Chunk>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Chunk> DECODER =
      new BinaryMessageDecoder<Chunk>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<Chunk> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<Chunk> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<Chunk> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Chunk>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this Chunk to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a Chunk from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a Chunk instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static Chunk fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Energistics.Etp.v12.Datatypes.Uuid blobId;
   private java.nio.ByteBuffer data;
   private boolean final$;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Chunk() {}

  /**
   * All-args constructor.
   * @param blobId The new value for blobId
   * @param data The new value for data
   * @param final$ The new value for final
   */
  public Chunk(Energistics.Etp.v12.Datatypes.Uuid blobId, java.nio.ByteBuffer data, java.lang.Boolean final$) {
    this.blobId = blobId;
    this.data = data;
    this.final$ = final$;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return blobId;
    case 1: return data;
    case 2: return final$;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: blobId = (Energistics.Etp.v12.Datatypes.Uuid)value$; break;
    case 1: data = (java.nio.ByteBuffer)value$; break;
    case 2: final$ = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'blobId' field.
   * @return The value of the 'blobId' field.
   */
  public Energistics.Etp.v12.Datatypes.Uuid getBlobId() {
    return blobId;
  }


  /**
   * Sets the value of the 'blobId' field.
   * @param value the value to set.
   */
  public void setBlobId(Energistics.Etp.v12.Datatypes.Uuid value) {
    this.blobId = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public java.nio.ByteBuffer getData() {
    return data;
  }


  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(java.nio.ByteBuffer value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'final$' field.
   * @return The value of the 'final$' field.
   */
  public boolean getFinal$() {
    return final$;
  }


  /**
   * Sets the value of the 'final$' field.
   * @param value the value to set.
   */
  public void setFinal$(boolean value) {
    this.final$ = value;
  }

  /**
   * Creates a new Chunk RecordBuilder.
   * @return A new Chunk RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder();
  }

  /**
   * Creates a new Chunk RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Chunk RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder newBuilder(Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder(other);
    }
  }

  /**
   * Creates a new Chunk RecordBuilder by copying an existing Chunk instance.
   * @param other The existing instance to copy.
   * @return A new Chunk RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder newBuilder(Energistics.Etp.v12.Protocol.StoreQuery.Chunk other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder(other);
    }
  }

  /**
   * RecordBuilder for Chunk instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Chunk>
    implements org.apache.avro.data.RecordBuilder<Chunk> {

    private Energistics.Etp.v12.Datatypes.Uuid blobId;
    private java.nio.ByteBuffer data;
    private boolean final$;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.blobId)) {
        this.blobId = data().deepCopy(fields()[0].schema(), other.blobId);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.final$)) {
        this.final$ = data().deepCopy(fields()[2].schema(), other.final$);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing Chunk instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.StoreQuery.Chunk other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.blobId)) {
        this.blobId = data().deepCopy(fields()[0].schema(), other.blobId);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.final$)) {
        this.final$ = data().deepCopy(fields()[2].schema(), other.final$);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'blobId' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.Uuid getBlobId() {
      return blobId;
    }


    /**
      * Sets the value of the 'blobId' field.
      * @param value The value of 'blobId'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder setBlobId(Energistics.Etp.v12.Datatypes.Uuid value) {
      validate(fields()[0], value);
      this.blobId = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'blobId' field has been set.
      * @return True if the 'blobId' field has been set, false otherwise.
      */
    public boolean hasBlobId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'blobId' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder clearBlobId() {
      blobId = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getData() {
      return data;
    }


    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder setData(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.data = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'data' field has been set.
      * @return True if the 'data' field has been set, false otherwise.
      */
    public boolean hasData() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder clearData() {
      data = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'final$' field.
      * @return The value.
      */
    public boolean getFinal$() {
      return final$;
    }


    /**
      * Sets the value of the 'final$' field.
      * @param value The value of 'final$'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder setFinal$(boolean value) {
      validate(fields()[2], value);
      this.final$ = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'final$' field has been set.
      * @return True if the 'final$' field has been set, false otherwise.
      */
    public boolean hasFinal$() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'final$' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.StoreQuery.Chunk.Builder clearFinal$() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Chunk build() {
      try {
        Chunk record = new Chunk();
        record.blobId = fieldSetFlags()[0] ? this.blobId : (Energistics.Etp.v12.Datatypes.Uuid) defaultValue(fields()[0]);
        record.data = fieldSetFlags()[1] ? this.data : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.final$ = fieldSetFlags()[2] ? this.final$ : (java.lang.Boolean) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Chunk>
    WRITER$ = (org.apache.avro.io.DatumWriter<Chunk>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Chunk>
    READER$ = (org.apache.avro.io.DatumReader<Chunk>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeFixed(this.blobId.bytes(), 0, 16);

    out.writeBytes(this.data);

    out.writeBoolean(this.final$);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.blobId == null) {
        this.blobId = new Energistics.Etp.v12.Datatypes.Uuid();
      }
      in.readFixed(this.blobId.bytes(), 0, 16);

      this.data = in.readBytes(this.data);

      this.final$ = in.readBoolean();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.blobId == null) {
            this.blobId = new Energistics.Etp.v12.Datatypes.Uuid();
          }
          in.readFixed(this.blobId.bytes(), 0, 16);
          break;

        case 1:
          this.data = in.readBytes(this.data);
          break;

        case 2:
          this.final$ = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










