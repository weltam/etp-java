/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Protocol.Discovery;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GetResources extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -1809693145447351199L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetResources\",\"namespace\":\"Energistics.Etp.v12.Protocol.Discovery\",\"fields\":[{\"name\":\"context\",\"type\":{\"type\":\"record\",\"name\":\"ContextInfo\",\"namespace\":\"Energistics.Etp.v12.Datatypes.Object\",\"fields\":[{\"name\":\"uri\",\"type\":\"string\"},{\"name\":\"depth\",\"type\":\"int\"},{\"name\":\"dataObjectTypes\",\"type\":{\"type\":\"array\",\"items\":\"string\"},\"default\":[]},{\"name\":\"navigableEdges\",\"type\":{\"type\":\"enum\",\"name\":\"RelationshipKind\",\"symbols\":[\"Primary\",\"Secondary\",\"Both\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.RelationshipKind\",\"depends\":[]}},{\"name\":\"includeSecondaryTargets\",\"type\":\"boolean\",\"default\":false},{\"name\":\"includeSecondarySources\",\"type\":\"boolean\",\"default\":false}],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.ContextInfo\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Object.RelationshipKind\"]}},{\"name\":\"scope\",\"type\":{\"type\":\"enum\",\"name\":\"ContextScopeKind\",\"namespace\":\"Energistics.Etp.v12.Datatypes.Object\",\"symbols\":[\"self\",\"sources\",\"targets\",\"sourcesOrSelf\",\"targetsOrSelf\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.ContextScopeKind\",\"depends\":[]}},{\"name\":\"countObjects\",\"type\":\"boolean\",\"default\":false},{\"name\":\"storeLastWriteFilter\",\"type\":[\"null\",\"long\"]},{\"name\":\"activeStatusFilter\",\"type\":[\"null\",{\"type\":\"enum\",\"name\":\"ActiveStatusKind\",\"namespace\":\"Energistics.Etp.v12.Datatypes.Object\",\"symbols\":[\"Active\",\"Inactive\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind\",\"depends\":[]}]},{\"name\":\"includeEdges\",\"type\":\"boolean\",\"default\":false}],\"protocol\":\"3\",\"messageType\":\"1\",\"senderRole\":\"customer\",\"protocolRoles\":\"store,customer\",\"multipartFlag\":false,\"fullName\":\"Energistics.Etp.v12.Protocol.Discovery.GetResources\",\"depends\":[\"Energistics.Etp.v12.Datatypes.Object.ContextInfo\",\"Energistics.Etp.v12.Datatypes.Object.ContextScopeKind\",\"Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind\"]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetResources> ENCODER =
      new BinaryMessageEncoder<GetResources>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetResources> DECODER =
      new BinaryMessageDecoder<GetResources>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetResources> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetResources> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetResources> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetResources>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetResources to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetResources from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetResources instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetResources fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private Energistics.Etp.v12.Datatypes.Object.ContextInfo context;
   private Energistics.Etp.v12.Datatypes.Object.ContextScopeKind scope;
   private boolean countObjects;
   private java.lang.Long storeLastWriteFilter;
   private Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind activeStatusFilter;
   private boolean includeEdges;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetResources() {}

  /**
   * All-args constructor.
   * @param context The new value for context
   * @param scope The new value for scope
   * @param countObjects The new value for countObjects
   * @param storeLastWriteFilter The new value for storeLastWriteFilter
   * @param activeStatusFilter The new value for activeStatusFilter
   * @param includeEdges The new value for includeEdges
   */
  public GetResources(Energistics.Etp.v12.Datatypes.Object.ContextInfo context, Energistics.Etp.v12.Datatypes.Object.ContextScopeKind scope, java.lang.Boolean countObjects, java.lang.Long storeLastWriteFilter, Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind activeStatusFilter, java.lang.Boolean includeEdges) {
    this.context = context;
    this.scope = scope;
    this.countObjects = countObjects;
    this.storeLastWriteFilter = storeLastWriteFilter;
    this.activeStatusFilter = activeStatusFilter;
    this.includeEdges = includeEdges;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return context;
    case 1: return scope;
    case 2: return countObjects;
    case 3: return storeLastWriteFilter;
    case 4: return activeStatusFilter;
    case 5: return includeEdges;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: context = (Energistics.Etp.v12.Datatypes.Object.ContextInfo)value$; break;
    case 1: scope = (Energistics.Etp.v12.Datatypes.Object.ContextScopeKind)value$; break;
    case 2: countObjects = (java.lang.Boolean)value$; break;
    case 3: storeLastWriteFilter = (java.lang.Long)value$; break;
    case 4: activeStatusFilter = (Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind)value$; break;
    case 5: includeEdges = (java.lang.Boolean)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'context' field.
   * @return The value of the 'context' field.
   */
  public Energistics.Etp.v12.Datatypes.Object.ContextInfo getContext() {
    return context;
  }


  /**
   * Sets the value of the 'context' field.
   * @param value the value to set.
   */
  public void setContext(Energistics.Etp.v12.Datatypes.Object.ContextInfo value) {
    this.context = value;
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
   * Gets the value of the 'storeLastWriteFilter' field.
   * @return The value of the 'storeLastWriteFilter' field.
   */
  public java.lang.Long getStoreLastWriteFilter() {
    return storeLastWriteFilter;
  }


  /**
   * Sets the value of the 'storeLastWriteFilter' field.
   * @param value the value to set.
   */
  public void setStoreLastWriteFilter(java.lang.Long value) {
    this.storeLastWriteFilter = value;
  }

  /**
   * Gets the value of the 'activeStatusFilter' field.
   * @return The value of the 'activeStatusFilter' field.
   */
  public Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind getActiveStatusFilter() {
    return activeStatusFilter;
  }


  /**
   * Sets the value of the 'activeStatusFilter' field.
   * @param value the value to set.
   */
  public void setActiveStatusFilter(Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind value) {
    this.activeStatusFilter = value;
  }

  /**
   * Gets the value of the 'includeEdges' field.
   * @return The value of the 'includeEdges' field.
   */
  public boolean getIncludeEdges() {
    return includeEdges;
  }


  /**
   * Sets the value of the 'includeEdges' field.
   * @param value the value to set.
   */
  public void setIncludeEdges(boolean value) {
    this.includeEdges = value;
  }

  /**
   * Creates a new GetResources RecordBuilder.
   * @return A new GetResources RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder newBuilder() {
    return new Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder();
  }

  /**
   * Creates a new GetResources RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetResources RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder newBuilder(Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder(other);
    }
  }

  /**
   * Creates a new GetResources RecordBuilder by copying an existing GetResources instance.
   * @param other The existing instance to copy.
   * @return A new GetResources RecordBuilder
   */
  public static Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder newBuilder(Energistics.Etp.v12.Protocol.Discovery.GetResources other) {
    if (other == null) {
      return new Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder();
    } else {
      return new Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetResources instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetResources>
    implements org.apache.avro.data.RecordBuilder<GetResources> {

    private Energistics.Etp.v12.Datatypes.Object.ContextInfo context;
    private Energistics.Etp.v12.Datatypes.Object.ContextInfo.Builder contextBuilder;
    private Energistics.Etp.v12.Datatypes.Object.ContextScopeKind scope;
    private boolean countObjects;
    private java.lang.Long storeLastWriteFilter;
    private Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind activeStatusFilter;
    private boolean includeEdges;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.context)) {
        this.context = data().deepCopy(fields()[0].schema(), other.context);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasContextBuilder()) {
        this.contextBuilder = Energistics.Etp.v12.Datatypes.Object.ContextInfo.newBuilder(other.getContextBuilder());
      }
      if (isValidValue(fields()[1], other.scope)) {
        this.scope = data().deepCopy(fields()[1].schema(), other.scope);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.countObjects)) {
        this.countObjects = data().deepCopy(fields()[2].schema(), other.countObjects);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.storeLastWriteFilter)) {
        this.storeLastWriteFilter = data().deepCopy(fields()[3].schema(), other.storeLastWriteFilter);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
      if (isValidValue(fields()[4], other.activeStatusFilter)) {
        this.activeStatusFilter = data().deepCopy(fields()[4].schema(), other.activeStatusFilter);
        fieldSetFlags()[4] = other.fieldSetFlags()[4];
      }
      if (isValidValue(fields()[5], other.includeEdges)) {
        this.includeEdges = data().deepCopy(fields()[5].schema(), other.includeEdges);
        fieldSetFlags()[5] = other.fieldSetFlags()[5];
      }
    }

    /**
     * Creates a Builder by copying an existing GetResources instance
     * @param other The existing instance to copy.
     */
    private Builder(Energistics.Etp.v12.Protocol.Discovery.GetResources other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.context)) {
        this.context = data().deepCopy(fields()[0].schema(), other.context);
        fieldSetFlags()[0] = true;
      }
      this.contextBuilder = null;
      if (isValidValue(fields()[1], other.scope)) {
        this.scope = data().deepCopy(fields()[1].schema(), other.scope);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.countObjects)) {
        this.countObjects = data().deepCopy(fields()[2].schema(), other.countObjects);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.storeLastWriteFilter)) {
        this.storeLastWriteFilter = data().deepCopy(fields()[3].schema(), other.storeLastWriteFilter);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.activeStatusFilter)) {
        this.activeStatusFilter = data().deepCopy(fields()[4].schema(), other.activeStatusFilter);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.includeEdges)) {
        this.includeEdges = data().deepCopy(fields()[5].schema(), other.includeEdges);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'context' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.Object.ContextInfo getContext() {
      return context;
    }


    /**
      * Sets the value of the 'context' field.
      * @param value The value of 'context'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder setContext(Energistics.Etp.v12.Datatypes.Object.ContextInfo value) {
      validate(fields()[0], value);
      this.contextBuilder = null;
      this.context = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'context' field has been set.
      * @return True if the 'context' field has been set, false otherwise.
      */
    public boolean hasContext() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'context' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public Energistics.Etp.v12.Datatypes.Object.ContextInfo.Builder getContextBuilder() {
      if (contextBuilder == null) {
        if (hasContext()) {
          setContextBuilder(Energistics.Etp.v12.Datatypes.Object.ContextInfo.newBuilder(context));
        } else {
          setContextBuilder(Energistics.Etp.v12.Datatypes.Object.ContextInfo.newBuilder());
        }
      }
      return contextBuilder;
    }

    /**
     * Sets the Builder instance for the 'context' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder setContextBuilder(Energistics.Etp.v12.Datatypes.Object.ContextInfo.Builder value) {
      clearContext();
      contextBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'context' field has an active Builder instance
     * @return True if the 'context' field has an active Builder instance
     */
    public boolean hasContextBuilder() {
      return contextBuilder != null;
    }

    /**
      * Clears the value of the 'context' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder clearContext() {
      context = null;
      contextBuilder = null;
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
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder setScope(Energistics.Etp.v12.Datatypes.Object.ContextScopeKind value) {
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
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder clearScope() {
      scope = null;
      fieldSetFlags()[1] = false;
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
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder setCountObjects(boolean value) {
      validate(fields()[2], value);
      this.countObjects = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'countObjects' field has been set.
      * @return True if the 'countObjects' field has been set, false otherwise.
      */
    public boolean hasCountObjects() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'countObjects' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder clearCountObjects() {
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'storeLastWriteFilter' field.
      * @return The value.
      */
    public java.lang.Long getStoreLastWriteFilter() {
      return storeLastWriteFilter;
    }


    /**
      * Sets the value of the 'storeLastWriteFilter' field.
      * @param value The value of 'storeLastWriteFilter'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder setStoreLastWriteFilter(java.lang.Long value) {
      validate(fields()[3], value);
      this.storeLastWriteFilter = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'storeLastWriteFilter' field has been set.
      * @return True if the 'storeLastWriteFilter' field has been set, false otherwise.
      */
    public boolean hasStoreLastWriteFilter() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'storeLastWriteFilter' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder clearStoreLastWriteFilter() {
      storeLastWriteFilter = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'activeStatusFilter' field.
      * @return The value.
      */
    public Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind getActiveStatusFilter() {
      return activeStatusFilter;
    }


    /**
      * Sets the value of the 'activeStatusFilter' field.
      * @param value The value of 'activeStatusFilter'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder setActiveStatusFilter(Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind value) {
      validate(fields()[4], value);
      this.activeStatusFilter = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'activeStatusFilter' field has been set.
      * @return True if the 'activeStatusFilter' field has been set, false otherwise.
      */
    public boolean hasActiveStatusFilter() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'activeStatusFilter' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder clearActiveStatusFilter() {
      activeStatusFilter = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'includeEdges' field.
      * @return The value.
      */
    public boolean getIncludeEdges() {
      return includeEdges;
    }


    /**
      * Sets the value of the 'includeEdges' field.
      * @param value The value of 'includeEdges'.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder setIncludeEdges(boolean value) {
      validate(fields()[5], value);
      this.includeEdges = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'includeEdges' field has been set.
      * @return True if the 'includeEdges' field has been set, false otherwise.
      */
    public boolean hasIncludeEdges() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'includeEdges' field.
      * @return This builder.
      */
    public Energistics.Etp.v12.Protocol.Discovery.GetResources.Builder clearIncludeEdges() {
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetResources build() {
      try {
        GetResources record = new GetResources();
        if (contextBuilder != null) {
          try {
            record.context = this.contextBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("context"));
            throw e;
          }
        } else {
          record.context = fieldSetFlags()[0] ? this.context : (Energistics.Etp.v12.Datatypes.Object.ContextInfo) defaultValue(fields()[0]);
        }
        record.scope = fieldSetFlags()[1] ? this.scope : (Energistics.Etp.v12.Datatypes.Object.ContextScopeKind) defaultValue(fields()[1]);
        record.countObjects = fieldSetFlags()[2] ? this.countObjects : (java.lang.Boolean) defaultValue(fields()[2]);
        record.storeLastWriteFilter = fieldSetFlags()[3] ? this.storeLastWriteFilter : (java.lang.Long) defaultValue(fields()[3]);
        record.activeStatusFilter = fieldSetFlags()[4] ? this.activeStatusFilter : (Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind) defaultValue(fields()[4]);
        record.includeEdges = fieldSetFlags()[5] ? this.includeEdges : (java.lang.Boolean) defaultValue(fields()[5]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetResources>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetResources>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetResources>
    READER$ = (org.apache.avro.io.DatumReader<GetResources>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.context.customEncode(out);

    out.writeEnum(this.scope.ordinal());

    out.writeBoolean(this.countObjects);

    if (this.storeLastWriteFilter == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeLong(this.storeLastWriteFilter);
    }

    if (this.activeStatusFilter == null) {
      out.writeIndex(0);
      out.writeNull();
    } else {
      out.writeIndex(1);
      out.writeEnum(this.activeStatusFilter.ordinal());
    }

    out.writeBoolean(this.includeEdges);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.context == null) {
        this.context = new Energistics.Etp.v12.Datatypes.Object.ContextInfo();
      }
      this.context.customDecode(in);

      this.scope = Energistics.Etp.v12.Datatypes.Object.ContextScopeKind.values()[in.readEnum()];

      this.countObjects = in.readBoolean();

      if (in.readIndex() != 1) {
        in.readNull();
        this.storeLastWriteFilter = null;
      } else {
        this.storeLastWriteFilter = in.readLong();
      }

      if (in.readIndex() != 1) {
        in.readNull();
        this.activeStatusFilter = null;
      } else {
        this.activeStatusFilter = Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind.values()[in.readEnum()];
      }

      this.includeEdges = in.readBoolean();

    } else {
      for (int i = 0; i < 6; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.context == null) {
            this.context = new Energistics.Etp.v12.Datatypes.Object.ContextInfo();
          }
          this.context.customDecode(in);
          break;

        case 1:
          this.scope = Energistics.Etp.v12.Datatypes.Object.ContextScopeKind.values()[in.readEnum()];
          break;

        case 2:
          this.countObjects = in.readBoolean();
          break;

        case 3:
          if (in.readIndex() != 1) {
            in.readNull();
            this.storeLastWriteFilter = null;
          } else {
            this.storeLastWriteFilter = in.readLong();
          }
          break;

        case 4:
          if (in.readIndex() != 1) {
            in.readNull();
            this.activeStatusFilter = null;
          } else {
            this.activeStatusFilter = Energistics.Etp.v12.Datatypes.Object.ActiveStatusKind.values()[in.readEnum()];
          }
          break;

        case 5:
          this.includeEdges = in.readBoolean();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










