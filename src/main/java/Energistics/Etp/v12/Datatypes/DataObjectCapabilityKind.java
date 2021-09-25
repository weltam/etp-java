/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package Energistics.Etp.v12.Datatypes;
@org.apache.avro.specific.AvroGenerated
public enum DataObjectCapabilityKind implements org.apache.avro.generic.GenericEnumSymbol<DataObjectCapabilityKind> {
  ActiveTimeoutPeriod, MaxContainedDataObjectCount, MaxDataObjectSize, OrphanedChildrenPrunedOnDelete, SupportsGet, SupportsPut, SupportsDelete, MaxSecondaryIndexCount  ;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"enum\",\"name\":\"DataObjectCapabilityKind\",\"namespace\":\"Energistics.Etp.v12.Datatypes\",\"symbols\":[\"ActiveTimeoutPeriod\",\"MaxContainedDataObjectCount\",\"MaxDataObjectSize\",\"OrphanedChildrenPrunedOnDelete\",\"SupportsGet\",\"SupportsPut\",\"SupportsDelete\",\"MaxSecondaryIndexCount\"],\"fullName\":\"Energistics.Etp.v12.Datatypes.DataObjectCapabilityKind\",\"depends\":[]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
}
