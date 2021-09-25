/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.GrowingObjectQuery;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class FindPartsResponse extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8539755047203283354L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"FindPartsResponse\",\"namespace\":\"Energistics.Etp.v12.Protocol.GrowingObjectQuery\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"serverSortOrder\",\"type\":\"string\"},{\"name\":\"format\",\"type\":\"string\",\"default\":\"xml\"},{\"name\":\"parts\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"ObjectPart\",\"namespace\":\"Energistics.Etp.v12.Datatypes.Object\",\"fields\":[{\"name\":\"uid\",\"type\":\"string\"},{\"name\":\"data\",\"type\":\"bytes\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.ObjectPart\",\"depends\":[]}},\"default\":[]}],\"protocol\":\"16\",\"messageType\":\"2\",\"senderRole\":\"store\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":true,\"fullName\":\"Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Object.ObjectPart\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<FindPartsResponse> ENCODER =
      new BinaryMessageEncoder<FindPartsResponse>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<FindPartsResponse> DECODER =
      new BinaryMessageDecoder<FindPartsResponse>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<FindPartsResponse> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<FindPartsResponse> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<FindPartsResponse> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<FindPartsResponse>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this FindPartsResponse to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a FindPartsResponse from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a FindPartsResponse instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static FindPartsResponse fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence uri;
   private java.lang.CharSequence serverSortOrder;
   private java.lang.CharSequence format;
   private java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> parts;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public FindPartsResponse() {}

  /**
   * All-args constructor.
   * @param uri The new value for uri
   * @param serverSortOrder The new value for serverSortOrder
   * @param format The new value for format
   * @param parts The new value for parts
   */
  public FindPartsResponse(java.lang.CharSequence uri, java.lang.CharSequence serverSortOrder, java.lang.CharSequence format, java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> parts) {
    this.uri = uri;
    this.serverSortOrder = serverSortOrder;
    this.format = format;
    this.parts = parts;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uri;
    case 1: return serverSortOrder;
    case 2: return format;
    case 3: return parts;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uri = (java.lang.CharSequence)value$; break;
    case 1: serverSortOrder = (java.lang.CharSequence)value$; break;
    case 2: format = (java.lang.CharSequence)value$; break;
    case 3: parts = (java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'uri' field.
   * @return The value of the 'uri' field.
   */
  public java.lang.CharSequence getUri() {
    return uri;
  }


  /**
   * Sets the value of the 'uri' field.
   * @param value the value to set.
   */
  public void setUri(java.lang.CharSequence value) {
    this.uri = value;
  }

  /**
   * Gets the value of the 'serverSortOrder' field.
   * @return The value of the 'serverSortOrder' field.
   */
  public java.lang.CharSequence getServerSortOrder() {
    return serverSortOrder;
  }


  /**
   * Sets the value of the 'serverSortOrder' field.
   * @param value the value to set.
   */
  public void setServerSortOrder(java.lang.CharSequence value) {
    this.serverSortOrder = value;
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
   * Gets the value of the 'parts' field.
   * @return The value of the 'parts' field.
   */
  public java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> getParts() {
    return parts;
  }


  /**
   * Sets the value of the 'parts' field.
   * @param value the value to set.
   */
  public void setParts(java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> value) {
    this.parts = value;
  }

  /**
   * Creates a new FindPartsResponse RecordBuilder.
   * @return A new FindPartsResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder();
  }

  /**
   * Creates a new FindPartsResponse RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new FindPartsResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder(other);
    }
  }

  /**
   * Creates a new FindPartsResponse RecordBuilder by copying an existing FindPartsResponse instance.
   * @param other The existing instance to copy.
   * @return A new FindPartsResponse RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder newBuilder(Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder(other);
    }
  }

  /**
   * RecordBuilder for FindPartsResponse instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<FindPartsResponse>
    implements org.apache.avro.data.RecordBuilder<FindPartsResponse> {

    private java.lang.CharSequence uri;
    private java.lang.CharSequence serverSortOrder;
    private java.lang.CharSequence format;
    private java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> parts;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uri)) {
        this.uri = data().deepCopy(fields()[0].schema(), other.uri);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.serverSortOrder)) {
        this.serverSortOrder = data().deepCopy(fields()[1].schema(), other.serverSortOrder);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.format)) {
        this.format = data().deepCopy(fields()[2].schema(), other.format);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.parts)) {
        this.parts = data().deepCopy(fields()[3].schema(), other.parts);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing FindPartsResponse instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.uri)) {
        this.uri = data().deepCopy(fields()[0].schema(), other.uri);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.serverSortOrder)) {
        this.serverSortOrder = data().deepCopy(fields()[1].schema(), other.serverSortOrder);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.format)) {
        this.format = data().deepCopy(fields()[2].schema(), other.format);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.parts)) {
        this.parts = data().deepCopy(fields()[3].schema(), other.parts);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'uri' field.
      * @return The value.
      */
    public java.lang.CharSequence getUri() {
      return uri;
    }


    /**
      * Sets the value of the 'uri' field.
      * @param value The value of 'uri'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder setUri(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.uri = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uri' field has been set.
      * @return True if the 'uri' field has been set, false otherwise.
      */
    public boolean hasUri() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'uri' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder clearUri() {
      uri = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'serverSortOrder' field.
      * @return The value.
      */
    public java.lang.CharSequence getServerSortOrder() {
      return serverSortOrder;
    }


    /**
      * Sets the value of the 'serverSortOrder' field.
      * @param value The value of 'serverSortOrder'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder setServerSortOrder(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.serverSortOrder = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'serverSortOrder' field has been set.
      * @return True if the 'serverSortOrder' field has been set, false otherwise.
      */
    public boolean hasServerSortOrder() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'serverSortOrder' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder clearServerSortOrder() {
      serverSortOrder = null;
      fieldSetFlags()[1] = false;
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
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder setFormat(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.format = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'format' field has been set.
      * @return True if the 'format' field has been set, false otherwise.
      */
    public boolean hasFormat() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'format' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder clearFormat() {
      format = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'parts' field.
      * @return The value.
      */
    public java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> getParts() {
      return parts;
    }


    /**
      * Sets the value of the 'parts' field.
      * @param value The value of 'parts'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder setParts(java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> value) {
      validate(fields()[3], value);
      this.parts = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'parts' field has been set.
      * @return True if the 'parts' field has been set, false otherwise.
      */
    public boolean hasParts() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'parts' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.GrowingObjectQuery.FindPartsResponse.Builder clearParts() {
      parts = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public FindPartsResponse build() {
      try {
        FindPartsResponse record = new FindPartsResponse();
        record.uri = fieldSetFlags()[0] ? this.uri : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.serverSortOrder = fieldSetFlags()[1] ? this.serverSortOrder : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.format = fieldSetFlags()[2] ? this.format : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.parts = fieldSetFlags()[3] ? this.parts : (java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart>) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<FindPartsResponse>
    WRITER$ = (org.apache.avro.io.DatumWriter<FindPartsResponse>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<FindPartsResponse>
    READER$ = (org.apache.avro.io.DatumReader<FindPartsResponse>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.uri);

    out.writeString(this.serverSortOrder);

    out.writeString(this.format);

    long size0 = this.parts.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (Energistics.Etp.v12.Datatypes.Object.ObjectPart e0: this.parts) {
      actualSize0++;
      out.startItem();
      e0.customEncode(out);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.uri = in.readString(this.uri instanceof Utf8 ? (Utf8)this.uri : null);

      this.serverSortOrder = in.readString(this.serverSortOrder instanceof Utf8 ? (Utf8)this.serverSortOrder : null);

      this.format = in.readString(this.format instanceof Utf8 ? (Utf8)this.format : null);

      long size0 = in.readArrayStart();
      java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> a0 = this.parts;
      if (a0 == null) {
        a0 = new SpecificData.Array<Energistics.Etp.v12.Datatypes.Object.ObjectPart>((int)size0, SCHEMA$.getField("parts").schema());
        this.parts = a0;
      } else a0.clear();
      SpecificData.Array<Energistics.Etp.v12.Datatypes.Object.ObjectPart> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<Energistics.Etp.v12.Datatypes.Object.ObjectPart>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          Energistics.Etp.v12.Datatypes.Object.ObjectPart e0 = (ga0 != null ? ga0.peek() : null);
          if (e0 == null) {
            e0 = new Energistics.Etp.v12.Datatypes.Object.ObjectPart();
          }
          e0.customDecode(in);
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.uri = in.readString(this.uri instanceof Utf8 ? (Utf8)this.uri : null);
          break;

        case 1:
          this.serverSortOrder = in.readString(this.serverSortOrder instanceof Utf8 ? (Utf8)this.serverSortOrder : null);
          break;

        case 2:
          this.format = in.readString(this.format instanceof Utf8 ? (Utf8)this.format : null);
          break;

        case 3:
          long size0 = in.readArrayStart();
          java.util.List<Energistics.Etp.v12.Datatypes.Object.ObjectPart> a0 = this.parts;
          if (a0 == null) {
            a0 = new SpecificData.Array<Energistics.Etp.v12.Datatypes.Object.ObjectPart>((int)size0, SCHEMA$.getField("parts").schema());
            this.parts = a0;
          } else a0.clear();
          SpecificData.Array<Energistics.Etp.v12.Datatypes.Object.ObjectPart> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<Energistics.Etp.v12.Datatypes.Object.ObjectPart>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              Energistics.Etp.v12.Datatypes.Object.ObjectPart e0 = (ga0 != null ? ga0.peek() : null);
              if (e0 == null) {
                e0 = new Energistics.Etp.v12.Datatypes.Object.ObjectPart();
              }
              e0.customDecode(in);
              a0.add(e0);
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










