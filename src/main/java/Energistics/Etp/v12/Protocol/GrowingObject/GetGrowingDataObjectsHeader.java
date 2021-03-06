/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.GrowingObject;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GetGrowingDataObjectsHeader extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4531939494993568979L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetGrowingDataObjectsHeader\",\"namespace\":\"Energistics.Etp.v12.Protocol.GrowingObject\",\"fields\":[{\"name\":\"uris\",\"type\":{\"type\":\"map\",\"values\":\"string\"}},{\"name\":\"format\",\"type\":\"string\",\"default\":\"xml\"}],\"protocol\":\"6\",\"messageType\":\"14\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetGrowingDataObjectsHeader> ENCODER =
      new BinaryMessageEncoder<GetGrowingDataObjectsHeader>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetGrowingDataObjectsHeader> DECODER =
      new BinaryMessageDecoder<GetGrowingDataObjectsHeader>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetGrowingDataObjectsHeader> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetGrowingDataObjectsHeader> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetGrowingDataObjectsHeader> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetGrowingDataObjectsHeader>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetGrowingDataObjectsHeader to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetGrowingDataObjectsHeader from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetGrowingDataObjectsHeader instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetGrowingDataObjectsHeader fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> uris;
   private java.lang.CharSequence format;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetGrowingDataObjectsHeader() {}

  /**
   * All-args constructor.
   * @param uris The new value for uris
   * @param format The new value for format
   */
  public GetGrowingDataObjectsHeader(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> uris, java.lang.CharSequence format) {
    this.uris = uris;
    this.format = format;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uris;
    case 1: return format;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uris = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
    case 1: format = (java.lang.CharSequence)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'uris' field.
   * @return The value of the 'uris' field.
   */
  public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getUris() {
    return uris;
  }


  /**
   * Sets the value of the 'uris' field.
   * @param value the value to set.
   */
  public void setUris(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
    this.uris = value;
  }

  /**
   * Gets the value of the 'format' field.
   * @return The value of the 'format' field.
   */
  public java.lang.CharSequence getFormat() {
    return format;
  }


  /**
   * Sets the value of the 'format' field.
   * @param value the value to set.
   */
  public void setFormat(java.lang.CharSequence value) {
    this.format = value;
  }

  /**
   * Creates a new GetGrowingDataObjectsHeader RecordBuilder.
   * @return A new GetGrowingDataObjectsHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder();
  }

  /**
   * Creates a new GetGrowingDataObjectsHeader RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetGrowingDataObjectsHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder(other);
    }
  }

  /**
   * Creates a new GetGrowingDataObjectsHeader RecordBuilder by copying an existing GetGrowingDataObjectsHeader instance.
   * @param other The existing instance to copy.
   * @return A new GetGrowingDataObjectsHeader RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetGrowingDataObjectsHeader instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetGrowingDataObjectsHeader>
    implements org.apache.avro.data.RecordBuilder<GetGrowingDataObjectsHeader> {

    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> uris;
    private java.lang.CharSequence format;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uris)) {
        this.uris = data().deepCopy(fields()[0].schema(), other.uris);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.format)) {
        this.format = data().deepCopy(fields()[1].schema(), other.format);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing GetGrowingDataObjectsHeader instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.uris)) {
        this.uris = data().deepCopy(fields()[0].schema(), other.uris);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.format)) {
        this.format = data().deepCopy(fields()[1].schema(), other.format);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'uris' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,java.lang.CharSequence> getUris() {
      return uris;
    }


    /**
      * Sets the value of the 'uris' field.
      * @param value The value of 'uris'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder setUris(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
      validate(fields()[0], value);
      this.uris = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uris' field has been set.
      * @return True if the 'uris' field has been set, false otherwise.
      */
    public boolean hasUris() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uris' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder clearUris() {
      uris = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'format' field.
      * @return The value.
      */
    public java.lang.CharSequence getFormat() {
      return format;
    }


    /**
      * Sets the value of the 'format' field.
      * @param value The value of 'format'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder setFormat(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.format = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'format' field has been set.
      * @return True if the 'format' field has been set, false otherwise.
      */
    public boolean hasFormat() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'format' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObject.GetGrowingDataObjectsHeader.Builder clearFormat() {
      format = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetGrowingDataObjectsHeader build() {
      try {
        GetGrowingDataObjectsHeader record = new GetGrowingDataObjectsHeader();
        record.uris = fieldSetFlags()[0] ? this.uris : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[0]);
        record.format = fieldSetFlags()[1] ? this.format : (java.lang.CharSequence) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetGrowingDataObjectsHeader>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetGrowingDataObjectsHeader>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetGrowingDataObjectsHeader>
    READER$ = (org.apache.avro.io.DatumReader<GetGrowingDataObjectsHeader>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    long size0 = this.uris.size();
    out.writeMapStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> e0: this.uris.entrySet()) {
      actualSize0++;
      out.startItem();
      out.writeString(e0.getKey());
      java.lang.CharSequence v0 = e0.getValue();
      out.writeString(v0);
    }
    out.writeMapEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Map-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    out.writeString(this.format);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      long size0 = in.readMapStart();
      java.util.Map<java.lang.CharSequence,java.lang.CharSequence> m0 = this.uris; // Need fresh name due to limitation of macro system
      if (m0 == null) {
        m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.CharSequence>((int)size0);
        this.uris = m0;
      } else m0.clear();
      for ( ; 0 < size0; size0 = in.mapNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.CharSequence k0 = null;
          k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
          java.lang.CharSequence v0 = null;
          v0 = in.readString(v0 instanceof Utf8 ? (Utf8)v0 : null);
          m0.put(k0, v0);
        }
      }

      this.format = in.readString(this.format instanceof Utf8 ? (Utf8)this.format : null);

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          long size0 = in.readMapStart();
          java.util.Map<java.lang.CharSequence,java.lang.CharSequence> m0 = this.uris; // Need fresh name due to limitation of macro system
          if (m0 == null) {
            m0 = new java.util.HashMap<java.lang.CharSequence,java.lang.CharSequence>((int)size0);
            this.uris = m0;
          } else m0.clear();
          for ( ; 0 < size0; size0 = in.mapNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.CharSequence k0 = null;
              k0 = in.readString(k0 instanceof Utf8 ? (Utf8)k0 : null);
              java.lang.CharSequence v0 = null;
              v0 = in.readString(v0 instanceof Utf8 ? (Utf8)v0 : null);
              m0.put(k0, v0);
            }
          }
          break;

        case 1:
          this.format = in.readString(this.format instanceof Utf8 ? (Utf8)this.format : null);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










