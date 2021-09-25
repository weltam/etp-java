/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.DataArray;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PutDataSubarrays extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2711778262398596563L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PutDataSubarrays\",\"namespace\":\"Energistics.Etp.v12.Protocol.DataArray\",\"fields\":[{\"name\":\"dataSubarrays\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"record\",\"name\":\"PutDataSubarraysType\",\"namespace\":\"Energistics.Etp.v12.Datatypes.DataArrayTypes\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"record\",\"name\":\"DataArrayIdentifier\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"pathInResource\",\"type\":\"string\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier\",\"depends\":[]}},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"AnyArray\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfString\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"depends\":[]},\"bytes\"]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnyArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\"]}},{\"name\":\"starts\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType\",\"depends\":[\"Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier\",\"Energistics.Etp.v12.Datatypes.AnyArray\"]}}}],\"protocol\":\"9\",\"messageType\":\"5\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays\",\"depends\":[\"Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PutDataSubarrays> ENCODER =
      new BinaryMessageEncoder<PutDataSubarrays>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PutDataSubarrays> DECODER =
      new BinaryMessageDecoder<PutDataSubarrays>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PutDataSubarrays> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PutDataSubarrays> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PutDataSubarrays> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PutDataSubarrays>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PutDataSubarrays to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PutDataSubarrays from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PutDataSubarrays instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PutDataSubarrays fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType> dataSubarrays;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PutDataSubarrays() {}

  /**
   * All-args constructor.
   * @param dataSubarrays The new value for dataSubarrays
   */
  public PutDataSubarrays(java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType> dataSubarrays) {
    this.dataSubarrays = dataSubarrays;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return dataSubarrays;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: dataSubarrays = (java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'dataSubarrays' field.
   * @return The value of the 'dataSubarrays' field.
   */
  public java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType> getDataSubarrays() {
    return dataSubarrays;
  }


  /**
   * Sets the value of the 'dataSubarrays' field.
   * @param value the value to set.
   */
  public void setDataSubarrays(java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType> value) {
    this.dataSubarrays = value;
  }

  /**
   * Creates a new PutDataSubarrays RecordBuilder.
   * @return A new PutDataSubarrays RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder();
  }

  /**
   * Creates a new PutDataSubarrays RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PutDataSubarrays RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder newBuilder(Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder(other);
    }
  }

  /**
   * Creates a new PutDataSubarrays RecordBuilder by copying an existing PutDataSubarrays instance.
   * @param other The existing instance to copy.
   * @return A new PutDataSubarrays RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder newBuilder(Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder(other);
    }
  }

  /**
   * RecordBuilder for PutDataSubarrays instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PutDataSubarrays>
    implements org.apache.avro.data.RecordBuilder<PutDataSubarrays> {

    private java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType> dataSubarrays;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.dataSubarrays)) {
        this.dataSubarrays = data().deepCopy(fields()[0].schema(), other.dataSubarrays);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
    }

    /**
     * Creates a Builder by copying an existing PutDataSubarrays instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.dataSubarrays)) {
        this.dataSubarrays = data().deepCopy(fields()[0].schema(), other.dataSubarrays);
        fieldSetFlags()[0] = true;
      }
    }

    /**
      * Gets the value of the 'dataSubarrays' field.
      * @return The value.
      */
    public java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType> getDataSubarrays() {
      return dataSubarrays;
    }


    /**
      * Sets the value of the 'dataSubarrays' field.
      * @param value The value of 'dataSubarrays'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder setDataSubarrays(java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType> value) {
      validate(fields()[0], value);
      this.dataSubarrays = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'dataSubarrays' field has been set.
      * @return True if the 'dataSubarrays' field has been set, false otherwise.
      */
    public boolean hasDataSubarrays() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'dataSubarrays' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.DataArray.PutDataSubarrays.Builder clearDataSubarrays() {
      dataSubarrays = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PutDataSubarrays build() {
      try {
        PutDataSubarrays record = new PutDataSubarrays();
        record.dataSubarrays = fieldSetFlags()[0] ? this.dataSubarrays : (java.util.Map<java.lang.CharSequence,Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType>) defaultValue(fields()[0]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PutDataSubarrays>
    WRITER$ = (org.apache.avro.io.DatumWriter<PutDataSubarrays>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PutDataSubarrays>
    READER$ = (org.apache.avro.io.DatumReader<PutDataSubarrays>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










