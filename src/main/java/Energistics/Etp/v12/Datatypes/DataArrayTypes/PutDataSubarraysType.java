/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Datatypes.DataArrayTypes;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class PutDataSubarraysType extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 4118812692120333098L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"PutDataSubarraysType\",\"namespace\":\"Energistics.Etp.v12.Datatypes.DataArrayTypes\",\"fields\":[{\"name\":\"uid\",\"type\":{\"type\":\"record\",\"name\":\"DataArrayIdentifier\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"pathInResource\",\"type\":\"string\"}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier\",\"depends\":[]}},{\"name\":\"data\",\"type\":{\"type\":\"record\",\"name\":\"AnyArray\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"fields\":[{\"name\":\"item\",\"type\":[{\"type\":\"record\",\"name\":\"ArrayOfBoolean\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"boolean\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfInt\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"int\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfLong\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfFloat\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"float\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfDouble\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"double\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"depends\":[]},{\"type\":\"record\",\"name\":\"ArrayOfString\",\"fields\":[{\"name\":\"values\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ArrayOfString\",\"depends\":[]},\"bytes\"]}],\"fullName\":\"Energistics.Etp.v12.Datatypes.AnyArray\",\"depends\":[\"Energistics.Etp.v12.Datatypes.ArrayOfBoolean\",\"Energistics.Etp.v12.Datatypes.ArrayOfInt\",\"Energistics.Etp.v12.Datatypes.ArrayOfLong\",\"Energistics.Etp.v12.Datatypes.ArrayOfFloat\",\"Energistics.Etp.v12.Datatypes.ArrayOfDouble\",\"Energistics.Etp.v12.Datatypes.ArrayOfString\"]}},{\"name\":\"starts\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"counts\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType\",\"depends\":[\"Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier\",\"Energistics.Etp.v12.Datatypes.AnyArray\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<PutDataSubarraysType> ENCODER =
      new BinaryMessageEncoder<PutDataSubarraysType>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<PutDataSubarraysType> DECODER =
      new BinaryMessageDecoder<PutDataSubarraysType>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<PutDataSubarraysType> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<PutDataSubarraysType> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<PutDataSubarraysType> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<PutDataSubarraysType>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this PutDataSubarraysType to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a PutDataSubarraysType from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a PutDataSubarraysType instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static PutDataSubarraysType fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier uid;
   private Energistics.Etp.v12.Datatypes.AnyArray data;
   private java.util.List<java.lang.Long> starts;
   private java.util.List<java.lang.Long> counts;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public PutDataSubarraysType() {}

  /**
   * All-args constructor.
   * @param uid The new value for uid
   * @param data The new value for data
   * @param starts The new value for starts
   * @param counts The new value for counts
   */
  public PutDataSubarraysType(Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier uid, Energistics.Etp.v12.Datatypes.AnyArray data, java.util.List<java.lang.Long> starts, java.util.List<java.lang.Long> counts) {
    this.uid = uid;
    this.data = data;
    this.starts = starts;
    this.counts = counts;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uid;
    case 1: return data;
    case 2: return starts;
    case 3: return counts;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uid = (Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier)value$; break;
    case 1: data = (Energistics.Etp.v12.Datatypes.AnyArray)value$; break;
    case 2: starts = (java.util.List<java.lang.Long>)value$; break;
    case 3: counts = (java.util.List<java.lang.Long>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'uid' field.
   * @return The value of the 'uid' field.
   */
  public Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier getUid() {
    return uid;
  }


  /**
   * Sets the value of the 'uid' field.
   * @param value the value to set.
   */
  public void setUid(Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier value) {
    this.uid = value;
  }

  /**
   * Gets the value of the 'data' field.
   * @return The value of the 'data' field.
   */
  public Energistics.Etp.v12.Datatypes.AnyArray getData() {
    return data;
  }


  /**
   * Sets the value of the 'data' field.
   * @param value the value to set.
   */
  public void setData(Energistics.Etp.v12.Datatypes.AnyArray value) {
    this.data = value;
  }

  /**
   * Gets the value of the 'starts' field.
   * @return The value of the 'starts' field.
   */
  public java.util.List<java.lang.Long> getStarts() {
    return starts;
  }


  /**
   * Sets the value of the 'starts' field.
   * @param value the value to set.
   */
  public void setStarts(java.util.List<java.lang.Long> value) {
    this.starts = value;
  }

  /**
   * Gets the value of the 'counts' field.
   * @return The value of the 'counts' field.
   */
  public java.util.List<java.lang.Long> getCounts() {
    return counts;
  }


  /**
   * Sets the value of the 'counts' field.
   * @param value the value to set.
   */
  public void setCounts(java.util.List<java.lang.Long> value) {
    this.counts = value;
  }

  /**
   * Creates a new PutDataSubarraysType RecordBuilder.
   * @return A new PutDataSubarraysType RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder();
  }

  /**
   * Creates a new PutDataSubarraysType RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new PutDataSubarraysType RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder newBuilder(Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder(other);
    }
  }

  /**
   * Creates a new PutDataSubarraysType RecordBuilder by copying an existing PutDataSubarraysType instance.
   * @param other The existing instance to copy.
   * @return A new PutDataSubarraysType RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder newBuilder(Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder(other);
    }
  }

  /**
   * RecordBuilder for PutDataSubarraysType instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<PutDataSubarraysType>
    implements org.apache.avro.data.RecordBuilder<PutDataSubarraysType> {

    private Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier uid;
    private Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier.Builder uidBuilder;
    private Energistics.Etp.v12.Datatypes.AnyArray data;
    private Energistics.Etp.v12.Datatypes.AnyArray.Builder dataBuilder;
    private java.util.List<java.lang.Long> starts;
    private java.util.List<java.lang.Long> counts;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasUidBuilder()) {
        this.uidBuilder = Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier.newBuilder(other.getUidBuilder());
      }
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasDataBuilder()) {
        this.dataBuilder = Energistics.Etp.v12.Datatypes.AnyArray.newBuilder(other.getDataBuilder());
      }
      if (isValidValue(fields()[2], other.starts)) {
        this.starts = data().deepCopy(fields()[2].schema(), other.starts);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.counts)) {
        this.counts = data().deepCopy(fields()[3].schema(), other.counts);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing PutDataSubarraysType instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.uid)) {
        this.uid = data().deepCopy(fields()[0].schema(), other.uid);
        fieldSetFlags()[0] = true;
      }
      this.uidBuilder = null;
      if (isValidValue(fields()[1], other.data)) {
        this.data = data().deepCopy(fields()[1].schema(), other.data);
        fieldSetFlags()[1] = true;
      }
      this.dataBuilder = null;
      if (isValidValue(fields()[2], other.starts)) {
        this.starts = data().deepCopy(fields()[2].schema(), other.starts);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.counts)) {
        this.counts = data().deepCopy(fields()[3].schema(), other.counts);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'uid' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier getUid() {
      return uid;
    }


    /**
      * Sets the value of the 'uid' field.
      * @param value The value of 'uid'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder setUid(Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier value) {
      validate(fields()[0], value);
      this.uidBuilder = null;
      this.uid = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'uid' field has been set.
      * @return True if the 'uid' field has been set, false otherwise.
      */
    public boolean hasUid() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'uid' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier.Builder getUidBuilder() {
      if (uidBuilder == null) {
        if (hasUid()) {
          setUidBuilder(Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier.newBuilder(uid));
        } else {
          setUidBuilder(Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier.newBuilder());
        }
      }
      return uidBuilder;
    }

    /**
     * Sets the Builder instance for the 'uid' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder setUidBuilder(Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier.Builder value) {
      clearUid();
      uidBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'uid' field has an active Builder instance
     * @return True if the 'uid' field has an active Builder instance
     */
    public boolean hasUidBuilder() {
      return uidBuilder != null;
    }

    /**
      * Clears the value of the 'uid' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder clearUid() {
      uid = null;
      uidBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'data' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.AnyArray getData() {
      return data;
    }


    /**
      * Sets the value of the 'data' field.
      * @param value The value of 'data'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder setData(Energistics.Etp.v12.Datatypes.AnyArray value) {
      validate(fields()[1], value);
      this.dataBuilder = null;
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
     * Gets the Builder instance for the 'data' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Etp.v12.Datatypes.AnyArray.Builder getDataBuilder() {
      if (dataBuilder == null) {
        if (hasData()) {
          setDataBuilder(Energistics.Etp.v12.Datatypes.AnyArray.newBuilder(data));
        } else {
          setDataBuilder(Energistics.Etp.v12.Datatypes.AnyArray.newBuilder());
        }
      }
      return dataBuilder;
    }

    /**
     * Sets the Builder instance for the 'data' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder setDataBuilder(Energistics.Etp.v12.Datatypes.AnyArray.Builder value) {
      clearData();
      dataBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'data' field has an active Builder instance
     * @return True if the 'data' field has an active Builder instance
     */
    public boolean hasDataBuilder() {
      return dataBuilder != null;
    }

    /**
      * Clears the value of the 'data' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder clearData() {
      data = null;
      dataBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'starts' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getStarts() {
      return starts;
    }


    /**
      * Sets the value of the 'starts' field.
      * @param value The value of 'starts'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder setStarts(java.util.List<java.lang.Long> value) {
      validate(fields()[2], value);
      this.starts = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'starts' field has been set.
      * @return True if the 'starts' field has been set, false otherwise.
      */
    public boolean hasStarts() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'starts' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder clearStarts() {
      starts = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'counts' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getCounts() {
      return counts;
    }


    /**
      * Sets the value of the 'counts' field.
      * @param value The value of 'counts'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder setCounts(java.util.List<java.lang.Long> value) {
      validate(fields()[3], value);
      this.counts = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'counts' field has been set.
      * @return True if the 'counts' field has been set, false otherwise.
      */
    public boolean hasCounts() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'counts' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.DataArrayTypes.PutDataSubarraysType.Builder clearCounts() {
      counts = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public PutDataSubarraysType build() {
      try {
        PutDataSubarraysType record = new PutDataSubarraysType();
        if (uidBuilder != null) {
          try {
            record.uid = this.uidBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("uid"));
            throw e;
          }
        } else {
          record.uid = fieldSetFlags()[0] ? this.uid : (Energistics.Etp.v12.Datatypes.DataArrayTypes.DataArrayIdentifier) defaultValue(fields()[0]);
        }
        if (dataBuilder != null) {
          try {
            record.data = this.dataBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("data"));
            throw e;
          }
        } else {
          record.data = fieldSetFlags()[1] ? this.data : (Energistics.Etp.v12.Datatypes.AnyArray) defaultValue(fields()[1]);
        }
        record.starts = fieldSetFlags()[2] ? this.starts : (java.util.List<java.lang.Long>) defaultValue(fields()[2]);
        record.counts = fieldSetFlags()[3] ? this.counts : (java.util.List<java.lang.Long>) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<PutDataSubarraysType>
    WRITER$ = (org.apache.avro.io.DatumWriter<PutDataSubarraysType>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<PutDataSubarraysType>
    READER$ = (org.apache.avro.io.DatumReader<PutDataSubarraysType>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}










