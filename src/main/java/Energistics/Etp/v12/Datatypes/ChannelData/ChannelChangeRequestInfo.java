/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Datatypes.ChannelData;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class ChannelChangeRequestInfo extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -3603746615198921325L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"ChannelChangeRequestInfo\",\"namespace\":\"Energistics.Etp.v12.Datatypes.ChannelData\",\"fields\":[{\"name\":\"sinceChangeTime\",\"type\":\"long\"},{\"name\":\"channelIds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}}],\"fullName\":\"Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<ChannelChangeRequestInfo> ENCODER =
      new BinaryMessageEncoder<ChannelChangeRequestInfo>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<ChannelChangeRequestInfo> DECODER =
      new BinaryMessageDecoder<ChannelChangeRequestInfo>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<ChannelChangeRequestInfo> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<ChannelChangeRequestInfo> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<ChannelChangeRequestInfo> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<ChannelChangeRequestInfo>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this ChannelChangeRequestInfo to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a ChannelChangeRequestInfo from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a ChannelChangeRequestInfo instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static ChannelChangeRequestInfo fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long sinceChangeTime;
   private java.util.List<java.lang.Long> channelIds;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public ChannelChangeRequestInfo() {}

  /**
   * All-args constructor.
   * @param sinceChangeTime The new value for sinceChangeTime
   * @param channelIds The new value for channelIds
   */
  public ChannelChangeRequestInfo(java.lang.Long sinceChangeTime, java.util.List<java.lang.Long> channelIds) {
    this.sinceChangeTime = sinceChangeTime;
    this.channelIds = channelIds;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return sinceChangeTime;
    case 1: return channelIds;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: sinceChangeTime = (java.lang.Long)value$; break;
    case 1: channelIds = (java.util.List<java.lang.Long>)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'sinceChangeTime' field.
   * @return The value of the 'sinceChangeTime' field.
   */
  public long getSinceChangeTime() {
    return sinceChangeTime;
  }


  /**
   * Sets the value of the 'sinceChangeTime' field.
   * @param value the value to set.
   */
  public void setSinceChangeTime(long value) {
    this.sinceChangeTime = value;
  }

  /**
   * Gets the value of the 'channelIds' field.
   * @return The value of the 'channelIds' field.
   */
  public java.util.List<java.lang.Long> getChannelIds() {
    return channelIds;
  }


  /**
   * Sets the value of the 'channelIds' field.
   * @param value the value to set.
   */
  public void setChannelIds(java.util.List<java.lang.Long> value) {
    this.channelIds = value;
  }

  /**
   * Creates a new ChannelChangeRequestInfo RecordBuilder.
   * @return A new ChannelChangeRequestInfo RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder newBuilder() {
    return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder();
  }

  /**
   * Creates a new ChannelChangeRequestInfo RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new ChannelChangeRequestInfo RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder newBuilder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder(other);
    }
  }

  /**
   * Creates a new ChannelChangeRequestInfo RecordBuilder by copying an existing ChannelChangeRequestInfo instance.
   * @param other The existing instance to copy.
   * @return A new ChannelChangeRequestInfo RecordBuilder
   */
  public static Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder newBuilder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo other) {
    if (other == null) {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder();
    } else {
      return new Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder(other);
    }
  }

  /**
   * RecordBuilder for ChannelChangeRequestInfo instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<ChannelChangeRequestInfo>
    implements org.apache.avro.data.RecordBuilder<ChannelChangeRequestInfo> {

    private long sinceChangeTime;
    private java.util.List<java.lang.Long> channelIds;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.sinceChangeTime)) {
        this.sinceChangeTime = data().deepCopy(fields()[0].schema(), other.sinceChangeTime);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.channelIds)) {
        this.channelIds = data().deepCopy(fields()[1].schema(), other.channelIds);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing ChannelChangeRequestInfo instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.sinceChangeTime)) {
        this.sinceChangeTime = data().deepCopy(fields()[0].schema(), other.sinceChangeTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.channelIds)) {
        this.channelIds = data().deepCopy(fields()[1].schema(), other.channelIds);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'sinceChangeTime' field.
      * @return The value.
      */
    public long getSinceChangeTime() {
      return sinceChangeTime;
    }


    /**
      * Sets the value of the 'sinceChangeTime' field.
      * @param value The value of 'sinceChangeTime'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder setSinceChangeTime(long value) {
      validate(fields()[0], value);
      this.sinceChangeTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'sinceChangeTime' field has been set.
      * @return True if the 'sinceChangeTime' field has been set, false otherwise.
      */
    public boolean hasSinceChangeTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'sinceChangeTime' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder clearSinceChangeTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'channelIds' field.
      * @return The value.
      */
    public java.util.List<java.lang.Long> getChannelIds() {
      return channelIds;
    }


    /**
      * Sets the value of the 'channelIds' field.
      * @param value The value of 'channelIds'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder setChannelIds(java.util.List<java.lang.Long> value) {
      validate(fields()[1], value);
      this.channelIds = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'channelIds' field has been set.
      * @return True if the 'channelIds' field has been set, false otherwise.
      */
    public boolean hasChannelIds() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'channelIds' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Datatypes.ChannelData.ChannelChangeRequestInfo.Builder clearChannelIds() {
      channelIds = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public ChannelChangeRequestInfo build() {
      try {
        ChannelChangeRequestInfo record = new ChannelChangeRequestInfo();
        record.sinceChangeTime = fieldSetFlags()[0] ? this.sinceChangeTime : (java.lang.Long) defaultValue(fields()[0]);
        record.channelIds = fieldSetFlags()[1] ? this.channelIds : (java.util.List<java.lang.Long>) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<ChannelChangeRequestInfo>
    WRITER$ = (org.apache.avro.io.DatumWriter<ChannelChangeRequestInfo>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<ChannelChangeRequestInfo>
    READER$ = (org.apache.avro.io.DatumReader<ChannelChangeRequestInfo>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.sinceChangeTime);

    long size0 = this.channelIds.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.Long e0: this.channelIds) {
      actualSize0++;
      out.startItem();
      out.writeLong(e0);
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
      this.sinceChangeTime = in.readLong();

      long size0 = in.readArrayStart();
      java.util.List<java.lang.Long> a0 = this.channelIds;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.Long>((int)size0, SCHEMA$.getField("channelIds").schema());
        this.channelIds = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.Long> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Long>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.Long e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readLong();
          a0.add(e0);
        }
      }

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.sinceChangeTime = in.readLong();
          break;

        case 1:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.Long> a0 = this.channelIds;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.Long>((int)size0, SCHEMA$.getField("channelIds").schema());
            this.channelIds = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.Long> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.Long>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.Long e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readLong();
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










