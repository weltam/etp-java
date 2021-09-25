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
public class GetPartsMetadata extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4477343516330179632L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetPartsMetadata\",\"namespace\":\"Energistics.Etp.v12.Protocol.GrowingObject\",\"fields\":[{\"name\":\"uris\",\"type\":{\"type\":\"map\",\"values\":\"string\"}}],\"protocol\":\"6\",\"messageType\":\"8\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetPartsMetadata> ENCODER =
      new BinaryMessageEncoder<GetPartsMetadata>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetPartsMetadata> DECODER =
      new BinaryMessageDecoder<GetPartsMetadata>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetPartsMetadata> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetPartsMetadata> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetPartsMetadata> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetPartsMetadata>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetPartsMetadata to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetPartsMetadata from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetPartsMetadata instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetPartsMetadata fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> uris;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetPartsMetadata() {}

  /**
   * All-args constructor.
   * @param uris The new value for uris
   */
  public GetPartsMetadata(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> uris) {
    this.uris = uris;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uris;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uris = (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>)value$; break;
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
   * Creates a new GetPartsMetadata RecordBuilder.
   * @return A new GetPartsMetadata RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder();
  }

  /**
   * Creates a new GetPartsMetadata RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetPartsMetadata RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder(other);
    }
  }

  /**
   * Creates a new GetPartsMetadata RecordBuilder by copying an existing GetPartsMetadata instance.
   * @param other The existing instance to copy.
   * @return A new GetPartsMetadata RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetPartsMetadata instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetPartsMetadata>
    implements org.apache.avro.data.RecordBuilder<GetPartsMetadata> {

    private java.util.Map<java.lang.CharSequence,java.lang.CharSequence> uris;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uris)) {
        this.uris = data().deepCopy(fields()[0].schema(), other.uris);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing GetPartsMetadata instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.uris)) {
        this.uris = data().deepCopy(fields()[0].schema(), other.uris);
        fieldSetFlags()[0] = true;
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
    public Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder setUris(java.util.Map<java.lang.CharSequence,java.lang.CharSequence> value) {
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
    public Energistics.Etp.v12.Protocol.GrowingObject.GetPartsMetadata.Builder clearUris() {
      uris = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetPartsMetadata build() {
      try {
        GetPartsMetadata record = new GetPartsMetadata();
        record.uris = fieldSetFlags()[0] ? this.uris : (java.util.Map<java.lang.CharSequence,java.lang.CharSequence>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetPartsMetadata>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetPartsMetadata>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetPartsMetadata>
    READER$ = (org.apache.avro.io.DatumReader<GetPartsMetadata>)MODEL$.createDatumReader(SCHEMA$);

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

    } else {
      for (int i = 0; i < 1; i++) {
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

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










