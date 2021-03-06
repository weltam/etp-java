/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.SupportedTypes;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GetSupportedTypes extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -654380318299052396L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetSupportedTypes\",\"namespace\":\"Energistics.Etp.v12.Protocol.SupportedTypes\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"scope\",\"type\":{\"type\":\"enum\",\"name\":\"ContextScopeKind\",\"namespace\":\"Energistics.Etp.v12.Datatypes.Object\",\"symbols\":[\"self\",\"sources\",\"targets\",\"sourcesOrSelf\",\"targetsOrSelf\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.ContextScopeKind\",\"depends\":[]}},{\"name\":\"returnEmptyTypes\",\"type\":\"boolean\",\"default\":false},{\"name\":\"countObjects\",\"type\":\"boolean\",\"default\":false}],\"protocol\":\"25\",\"messageType\":\"1\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Object.ContextScopeKind\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetSupportedTypes> ENCODER =
      new BinaryMessageEncoder<GetSupportedTypes>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetSupportedTypes> DECODER =
      new BinaryMessageDecoder<GetSupportedTypes>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetSupportedTypes> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetSupportedTypes> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetSupportedTypes> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetSupportedTypes>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetSupportedTypes to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetSupportedTypes from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetSupportedTypes instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetSupportedTypes fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private java.lang.CharSequence uri;
   private Energistics.Etp.v12.Datatypes.Object.ContextScopeKind scope;
   private boolean returnEmptyTypes;
   private boolean countObjects;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetSupportedTypes() {}

  /**
   * All-args constructor.
   * @param uri The new value for uri
   * @param scope The new value for scope
   * @param returnEmptyTypes The new value for returnEmptyTypes
   * @param countObjects The new value for countObjects
   */
  public GetSupportedTypes(java.lang.CharSequence uri, Energistics.Etp.v12.Datatypes.Object.ContextScopeKind scope, java.lang.Boolean returnEmptyTypes, java.lang.Boolean countObjects) {
    this.uri = uri;
    this.scope = scope;
    this.returnEmptyTypes = returnEmptyTypes;
    this.countObjects = countObjects;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return uri;
    case 1: return scope;
    case 2: return returnEmptyTypes;
    case 3: return countObjects;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: uri = (java.lang.CharSequence)value$; break;
    case 1: scope = (Energistics.Etp.v12.Datatypes.Object.ContextScopeKind)value$; break;
    case 2: returnEmptyTypes = (java.lang.Boolean)value$; break;
    case 3: countObjects = (java.lang.Boolean)value$; break;
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
   * Gets the value of the 'scope' field.
   * @return The value of the 'scope' field.
   */
  public Energistics.Etp.v12.Datatypes.Object.ContextScopeKind getScope() {
    return scope;
  }


  /**
   * Sets the value of the 'scope' field.
   * @param value the value to set.
   */
  public void setScope(Energistics.Etp.v12.Datatypes.Object.ContextScopeKind value) {
    this.scope = value;
  }

  /**
   * Gets the value of the 'returnEmptyTypes' field.
   * @return The value of the 'returnEmptyTypes' field.
   */
  public boolean getReturnEmptyTypes() {
    return returnEmptyTypes;
  }


  /**
   * Sets the value of the 'returnEmptyTypes' field.
   * @param value the value to set.
   */
  public void setReturnEmptyTypes(boolean value) {
    this.returnEmptyTypes = value;
  }

  /**
   * Gets the value of the 'countObjects' field.
   * @return The value of the 'countObjects' field.
   */
  public boolean getCountObjects() {
    return countObjects;
  }


  /**
   * Sets the value of the 'countObjects' field.
   * @param value the value to set.
   */
  public void setCountObjects(boolean value) {
    this.countObjects = value;
  }

  /**
   * Creates a new GetSupportedTypes RecordBuilder.
   * @return A new GetSupportedTypes RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder();
  }

  /**
   * Creates a new GetSupportedTypes RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetSupportedTypes RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder newBuilder(Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder(other);
    }
  }

  /**
   * Creates a new GetSupportedTypes RecordBuilder by copying an existing GetSupportedTypes instance.
   * @param other The existing instance to copy.
   * @return A new GetSupportedTypes RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder newBuilder(Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetSupportedTypes instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetSupportedTypes>
    implements org.apache.avro.data.RecordBuilder<GetSupportedTypes> {

    private java.lang.CharSequence uri;
    private Energistics.Etp.v12.Datatypes.Object.ContextScopeKind scope;
    private boolean returnEmptyTypes;
    private boolean countObjects;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.uri)) {
        this.uri = data().deepCopy(fields()[0].schema(), other.uri);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.scope)) {
        this.scope = data().deepCopy(fields()[1].schema(), other.scope);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.returnEmptyTypes)) {
        this.returnEmptyTypes = data().deepCopy(fields()[2].schema(), other.returnEmptyTypes);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.countObjects)) {
        this.countObjects = data().deepCopy(fields()[3].schema(), other.countObjects);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing GetSupportedTypes instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.uri)) {
        this.uri = data().deepCopy(fields()[0].schema(), other.uri);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.scope)) {
        this.scope = data().deepCopy(fields()[1].schema(), other.scope);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.returnEmptyTypes)) {
        this.returnEmptyTypes = data().deepCopy(fields()[2].schema(), other.returnEmptyTypes);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.countObjects)) {
        this.countObjects = data().deepCopy(fields()[3].schema(), other.countObjects);
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
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder setUri(java.lang.CharSequence value) {
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
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder clearUri() {
      uri = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'scope' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.Object.ContextScopeKind getScope() {
      return scope;
    }


    /**
      * Sets the value of the 'scope' field.
      * @param value The value of 'scope'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder setScope(Energistics.Etp.v12.Datatypes.Object.ContextScopeKind value) {
      validate(fields()[1], value);
      this.scope = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'scope' field has been set.
      * @return True if the 'scope' field has been set, false otherwise.
      */
    public boolean hasScope() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'scope' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder clearScope() {
      scope = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'returnEmptyTypes' field.
      * @return The value.
      */
    public boolean getReturnEmptyTypes() {
      return returnEmptyTypes;
    }


    /**
      * Sets the value of the 'returnEmptyTypes' field.
      * @param value The value of 'returnEmptyTypes'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder setReturnEmptyTypes(boolean value) {
      validate(fields()[2], value);
      this.returnEmptyTypes = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'returnEmptyTypes' field has been set.
      * @return True if the 'returnEmptyTypes' field has been set, false otherwise.
      */
    public boolean hasReturnEmptyTypes() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'returnEmptyTypes' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder clearReturnEmptyTypes() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'countObjects' field.
      * @return The value.
      */
    public boolean getCountObjects() {
      return countObjects;
    }


    /**
      * Sets the value of the 'countObjects' field.
      * @param value The value of 'countObjects'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder setCountObjects(boolean value) {
      validate(fields()[3], value);
      this.countObjects = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'countObjects' field has been set.
      * @return True if the 'countObjects' field has been set, false otherwise.
      */
    public boolean hasCountObjects() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'countObjects' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.SupportedTypes.GetSupportedTypes.Builder clearCountObjects() {
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetSupportedTypes build() {
      try {
        GetSupportedTypes record = new GetSupportedTypes();
        record.uri = fieldSetFlags()[0] ? this.uri : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.scope = fieldSetFlags()[1] ? this.scope : (Energistics.Etp.v12.Datatypes.Object.ContextScopeKind) defaultValue(fields()[1]);
        record.returnEmptyTypes = fieldSetFlags()[2] ? this.returnEmptyTypes : (java.lang.Boolean) defaultValue(fields()[2]);
        record.countObjects = fieldSetFlags()[3] ? this.countObjects : (java.lang.Boolean) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetSupportedTypes>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetSupportedTypes>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetSupportedTypes>
    READER$ = (org.apache.avro.io.DatumReader<GetSupportedTypes>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.uri);

    out.writeEnum(this.scope.ordinal());

    out.writeBoolean(this.returnEmptyTypes);

    out.writeBoolean(this.countObjects);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.uri = in.readString(this.uri instanceof Utf8 ? (Utf8)this.uri : null);

      this.scope = Energistics.Etp.v12.Datatypes.Object.ContextScopeKind.values()[in.readEnum()];

      this.returnEmptyTypes = in.readBoolean();

      this.countObjects = in.readBoolean();

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.uri = in.readString(this.uri instanceof Utf8 ? (Utf8)this.uri : null);
          break;

        case 1:
          this.scope = Energistics.Etp.v12.Datatypes.Object.ContextScopeKind.values()[in.readEnum()];
          break;

        case 2:
          this.returnEmptyTypes = in.readBoolean();
          break;

        case 3:
          this.countObjects = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










