/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 *
 * Convenience access to all tables in cattle
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table cattle.account
	 */
	public static final io.cattle.platform.core.model.tables.AccountTable ACCOUNT = io.cattle.platform.core.model.tables.AccountTable.ACCOUNT;

	/**
	 * The table cattle.agent
	 */
	public static final io.cattle.platform.core.model.tables.AgentTable AGENT = io.cattle.platform.core.model.tables.AgentTable.AGENT;

	/**
	 * The table cattle.agent_group
	 */
	public static final io.cattle.platform.core.model.tables.AgentGroupTable AGENT_GROUP = io.cattle.platform.core.model.tables.AgentGroupTable.AGENT_GROUP;

	/**
	 * The table cattle.audit_log
	 */
	public static final io.cattle.platform.core.model.tables.AuditLogTable AUDIT_LOG = io.cattle.platform.core.model.tables.AuditLogTable.AUDIT_LOG;

	/**
	 * The table cattle.auth_token
	 */
	public static final io.cattle.platform.core.model.tables.AuthTokenTable AUTH_TOKEN = io.cattle.platform.core.model.tables.AuthTokenTable.AUTH_TOKEN;

	/**
	 * The table cattle.certificate
	 */
	public static final io.cattle.platform.core.model.tables.CertificateTable CERTIFICATE = io.cattle.platform.core.model.tables.CertificateTable.CERTIFICATE;

	/**
	 * The table cattle.cluster_host_map
	 */
	public static final io.cattle.platform.core.model.tables.ClusterHostMapTable CLUSTER_HOST_MAP = io.cattle.platform.core.model.tables.ClusterHostMapTable.CLUSTER_HOST_MAP;

	/**
	 * The table cattle.config_item
	 */
	public static final io.cattle.platform.core.model.tables.ConfigItemTable CONFIG_ITEM = io.cattle.platform.core.model.tables.ConfigItemTable.CONFIG_ITEM;

	/**
	 * The table cattle.config_item_status
	 */
	public static final io.cattle.platform.core.model.tables.ConfigItemStatusTable CONFIG_ITEM_STATUS = io.cattle.platform.core.model.tables.ConfigItemStatusTable.CONFIG_ITEM_STATUS;

	/**
	 * The table cattle.container_event
	 */
	public static final io.cattle.platform.core.model.tables.ContainerEventTable CONTAINER_EVENT = io.cattle.platform.core.model.tables.ContainerEventTable.CONTAINER_EVENT;

	/**
	 * The table cattle.credential
	 */
	public static final io.cattle.platform.core.model.tables.CredentialTable CREDENTIAL = io.cattle.platform.core.model.tables.CredentialTable.CREDENTIAL;

	/**
	 * The table cattle.credential_instance_map
	 */
	public static final io.cattle.platform.core.model.tables.CredentialInstanceMapTable CREDENTIAL_INSTANCE_MAP = io.cattle.platform.core.model.tables.CredentialInstanceMapTable.CREDENTIAL_INSTANCE_MAP;

	/**
	 * The table cattle.data
	 */
	public static final io.cattle.platform.core.model.tables.DataTable DATA = io.cattle.platform.core.model.tables.DataTable.DATA;

	/**
	 * The table cattle.DATABASECHANGELOG
	 */
	public static final io.cattle.platform.core.model.tables.DatabasechangelogTable DATABASECHANGELOG = io.cattle.platform.core.model.tables.DatabasechangelogTable.DATABASECHANGELOG;

	/**
	 * The table cattle.DATABASECHANGELOGLOCK
	 */
	public static final io.cattle.platform.core.model.tables.DatabasechangeloglockTable DATABASECHANGELOGLOCK = io.cattle.platform.core.model.tables.DatabasechangeloglockTable.DATABASECHANGELOGLOCK;

	/**
	 * The table cattle.dynamic_schema
	 */
	public static final io.cattle.platform.core.model.tables.DynamicSchemaTable DYNAMIC_SCHEMA = io.cattle.platform.core.model.tables.DynamicSchemaTable.DYNAMIC_SCHEMA;

	/**
	 * The table cattle.dynamic_schema_role
	 */
	public static final io.cattle.platform.core.model.tables.DynamicSchemaRoleTable DYNAMIC_SCHEMA_ROLE = io.cattle.platform.core.model.tables.DynamicSchemaRoleTable.DYNAMIC_SCHEMA_ROLE;

	/**
	 * The table cattle.environment
	 */
	public static final io.cattle.platform.core.model.tables.EnvironmentTable ENVIRONMENT = io.cattle.platform.core.model.tables.EnvironmentTable.ENVIRONMENT;

	/**
	 * The table cattle.external_event
	 */
	public static final io.cattle.platform.core.model.tables.ExternalEventTable EXTERNAL_EVENT = io.cattle.platform.core.model.tables.ExternalEventTable.EXTERNAL_EVENT;

	/**
	 * The table cattle.external_handler
	 */
	public static final io.cattle.platform.core.model.tables.ExternalHandlerTable EXTERNAL_HANDLER = io.cattle.platform.core.model.tables.ExternalHandlerTable.EXTERNAL_HANDLER;

	/**
	 * The table cattle.external_handler_external_handler_process_map
	 */
	public static final io.cattle.platform.core.model.tables.ExternalHandlerExternalHandlerProcessMapTable EXTERNAL_HANDLER_EXTERNAL_HANDLER_PROCESS_MAP = io.cattle.platform.core.model.tables.ExternalHandlerExternalHandlerProcessMapTable.EXTERNAL_HANDLER_EXTERNAL_HANDLER_PROCESS_MAP;

	/**
	 * The table cattle.external_handler_process
	 */
	public static final io.cattle.platform.core.model.tables.ExternalHandlerProcessTable EXTERNAL_HANDLER_PROCESS = io.cattle.platform.core.model.tables.ExternalHandlerProcessTable.EXTERNAL_HANDLER_PROCESS;

	/**
	 * The table cattle.generic_object
	 */
	public static final io.cattle.platform.core.model.tables.GenericObjectTable GENERIC_OBJECT = io.cattle.platform.core.model.tables.GenericObjectTable.GENERIC_OBJECT;

	/**
	 * The table cattle.healthcheck_instance
	 */
	public static final io.cattle.platform.core.model.tables.HealthcheckInstanceTable HEALTHCHECK_INSTANCE = io.cattle.platform.core.model.tables.HealthcheckInstanceTable.HEALTHCHECK_INSTANCE;

	/**
	 * The table cattle.healthcheck_instance_host_map
	 */
	public static final io.cattle.platform.core.model.tables.HealthcheckInstanceHostMapTable HEALTHCHECK_INSTANCE_HOST_MAP = io.cattle.platform.core.model.tables.HealthcheckInstanceHostMapTable.HEALTHCHECK_INSTANCE_HOST_MAP;

	/**
	 * The table cattle.host
	 */
	public static final io.cattle.platform.core.model.tables.HostTable HOST = io.cattle.platform.core.model.tables.HostTable.HOST;

	/**
	 * The table cattle.host_disk
	 */
	public static final io.cattle.platform.core.model.tables.HostDiskTable HOST_DISK = io.cattle.platform.core.model.tables.HostDiskTable.HOST_DISK;

	/**
	 * The table cattle.host_ip_address_map
	 */
	public static final io.cattle.platform.core.model.tables.HostIpAddressMapTable HOST_IP_ADDRESS_MAP = io.cattle.platform.core.model.tables.HostIpAddressMapTable.HOST_IP_ADDRESS_MAP;

	/**
	 * The table cattle.host_label_map
	 */
	public static final io.cattle.platform.core.model.tables.HostLabelMapTable HOST_LABEL_MAP = io.cattle.platform.core.model.tables.HostLabelMapTable.HOST_LABEL_MAP;

	/**
	 * The table cattle.host_vnet_map
	 */
	public static final io.cattle.platform.core.model.tables.HostVnetMapTable HOST_VNET_MAP = io.cattle.platform.core.model.tables.HostVnetMapTable.HOST_VNET_MAP;

	/**
	 * The table cattle.image
	 */
	public static final io.cattle.platform.core.model.tables.ImageTable IMAGE = io.cattle.platform.core.model.tables.ImageTable.IMAGE;

	/**
	 * The table cattle.image_storage_pool_map
	 */
	public static final io.cattle.platform.core.model.tables.ImageStoragePoolMapTable IMAGE_STORAGE_POOL_MAP = io.cattle.platform.core.model.tables.ImageStoragePoolMapTable.IMAGE_STORAGE_POOL_MAP;

	/**
	 * The table cattle.instance
	 */
	public static final io.cattle.platform.core.model.tables.InstanceTable INSTANCE = io.cattle.platform.core.model.tables.InstanceTable.INSTANCE;

	/**
	 * The table cattle.instance_host_map
	 */
	public static final io.cattle.platform.core.model.tables.InstanceHostMapTable INSTANCE_HOST_MAP = io.cattle.platform.core.model.tables.InstanceHostMapTable.INSTANCE_HOST_MAP;

	/**
	 * The table cattle.instance_label_map
	 */
	public static final io.cattle.platform.core.model.tables.InstanceLabelMapTable INSTANCE_LABEL_MAP = io.cattle.platform.core.model.tables.InstanceLabelMapTable.INSTANCE_LABEL_MAP;

	/**
	 * The table cattle.instance_link
	 */
	public static final io.cattle.platform.core.model.tables.InstanceLinkTable INSTANCE_LINK = io.cattle.platform.core.model.tables.InstanceLinkTable.INSTANCE_LINK;

	/**
	 * The table cattle.ip_address
	 */
	public static final io.cattle.platform.core.model.tables.IpAddressTable IP_ADDRESS = io.cattle.platform.core.model.tables.IpAddressTable.IP_ADDRESS;

	/**
	 * The table cattle.ip_address_nic_map
	 */
	public static final io.cattle.platform.core.model.tables.IpAddressNicMapTable IP_ADDRESS_NIC_MAP = io.cattle.platform.core.model.tables.IpAddressNicMapTable.IP_ADDRESS_NIC_MAP;

	/**
	 * The table cattle.ip_association
	 */
	public static final io.cattle.platform.core.model.tables.IpAssociationTable IP_ASSOCIATION = io.cattle.platform.core.model.tables.IpAssociationTable.IP_ASSOCIATION;

	/**
	 * The table cattle.ip_pool
	 */
	public static final io.cattle.platform.core.model.tables.IpPoolTable IP_POOL = io.cattle.platform.core.model.tables.IpPoolTable.IP_POOL;

	/**
	 * The table cattle.label
	 */
	public static final io.cattle.platform.core.model.tables.LabelTable LABEL = io.cattle.platform.core.model.tables.LabelTable.LABEL;

	/**
	 * The table cattle.machine_driver
	 */
	public static final io.cattle.platform.core.model.tables.MachineDriverTable MACHINE_DRIVER = io.cattle.platform.core.model.tables.MachineDriverTable.MACHINE_DRIVER;

	/**
	 * The table cattle.mount
	 */
	public static final io.cattle.platform.core.model.tables.MountTable MOUNT = io.cattle.platform.core.model.tables.MountTable.MOUNT;

	/**
	 * The table cattle.network
	 */
	public static final io.cattle.platform.core.model.tables.NetworkTable NETWORK = io.cattle.platform.core.model.tables.NetworkTable.NETWORK;

	/**
	 * The table cattle.network_service
	 */
	public static final io.cattle.platform.core.model.tables.NetworkServiceTable NETWORK_SERVICE = io.cattle.platform.core.model.tables.NetworkServiceTable.NETWORK_SERVICE;

	/**
	 * The table cattle.network_service_provider
	 */
	public static final io.cattle.platform.core.model.tables.NetworkServiceProviderTable NETWORK_SERVICE_PROVIDER = io.cattle.platform.core.model.tables.NetworkServiceProviderTable.NETWORK_SERVICE_PROVIDER;

	/**
	 * The table cattle.network_service_provider_instance_map
	 */
	public static final io.cattle.platform.core.model.tables.NetworkServiceProviderInstanceMapTable NETWORK_SERVICE_PROVIDER_INSTANCE_MAP = io.cattle.platform.core.model.tables.NetworkServiceProviderInstanceMapTable.NETWORK_SERVICE_PROVIDER_INSTANCE_MAP;

	/**
	 * The table cattle.nic
	 */
	public static final io.cattle.platform.core.model.tables.NicTable NIC = io.cattle.platform.core.model.tables.NicTable.NIC;

	/**
	 * The table cattle.offering
	 */
	public static final io.cattle.platform.core.model.tables.OfferingTable OFFERING = io.cattle.platform.core.model.tables.OfferingTable.OFFERING;

	/**
	 * The table cattle.physical_host
	 */
	public static final io.cattle.platform.core.model.tables.PhysicalHostTable PHYSICAL_HOST = io.cattle.platform.core.model.tables.PhysicalHostTable.PHYSICAL_HOST;

	/**
	 * The table cattle.port
	 */
	public static final io.cattle.platform.core.model.tables.PortTable PORT = io.cattle.platform.core.model.tables.PortTable.PORT;

	/**
	 * The table cattle.process_execution
	 */
	public static final io.cattle.platform.core.model.tables.ProcessExecutionTable PROCESS_EXECUTION = io.cattle.platform.core.model.tables.ProcessExecutionTable.PROCESS_EXECUTION;

	/**
	 * The table cattle.process_instance
	 */
	public static final io.cattle.platform.core.model.tables.ProcessInstanceTable PROCESS_INSTANCE = io.cattle.platform.core.model.tables.ProcessInstanceTable.PROCESS_INSTANCE;

	/**
	 * The table cattle.project_member
	 */
	public static final io.cattle.platform.core.model.tables.ProjectMemberTable PROJECT_MEMBER = io.cattle.platform.core.model.tables.ProjectMemberTable.PROJECT_MEMBER;

	/**
	 * The table cattle.resource_pool
	 */
	public static final io.cattle.platform.core.model.tables.ResourcePoolTable RESOURCE_POOL = io.cattle.platform.core.model.tables.ResourcePoolTable.RESOURCE_POOL;

	/**
	 * The table cattle.service
	 */
	public static final io.cattle.platform.core.model.tables.ServiceTable SERVICE = io.cattle.platform.core.model.tables.ServiceTable.SERVICE;

	/**
	 * The table cattle.service_consume_map
	 */
	public static final io.cattle.platform.core.model.tables.ServiceConsumeMapTable SERVICE_CONSUME_MAP = io.cattle.platform.core.model.tables.ServiceConsumeMapTable.SERVICE_CONSUME_MAP;

	/**
	 * The table cattle.service_event
	 */
	public static final io.cattle.platform.core.model.tables.ServiceEventTable SERVICE_EVENT = io.cattle.platform.core.model.tables.ServiceEventTable.SERVICE_EVENT;

	/**
	 * The table cattle.service_expose_map
	 */
	public static final io.cattle.platform.core.model.tables.ServiceExposeMapTable SERVICE_EXPOSE_MAP = io.cattle.platform.core.model.tables.ServiceExposeMapTable.SERVICE_EXPOSE_MAP;

	/**
	 * The table cattle.service_index
	 */
	public static final io.cattle.platform.core.model.tables.ServiceIndexTable SERVICE_INDEX = io.cattle.platform.core.model.tables.ServiceIndexTable.SERVICE_INDEX;

	/**
	 * The table cattle.setting
	 */
	public static final io.cattle.platform.core.model.tables.SettingTable SETTING = io.cattle.platform.core.model.tables.SettingTable.SETTING;

	/**
	 * The table cattle.snapshot
	 */
	public static final io.cattle.platform.core.model.tables.SnapshotTable SNAPSHOT = io.cattle.platform.core.model.tables.SnapshotTable.SNAPSHOT;

	/**
	 * The table cattle.snapshot_storage_pool_map
	 */
	public static final io.cattle.platform.core.model.tables.SnapshotStoragePoolMapTable SNAPSHOT_STORAGE_POOL_MAP = io.cattle.platform.core.model.tables.SnapshotStoragePoolMapTable.SNAPSHOT_STORAGE_POOL_MAP;

	/**
	 * The table cattle.storage_pool
	 */
	public static final io.cattle.platform.core.model.tables.StoragePoolTable STORAGE_POOL = io.cattle.platform.core.model.tables.StoragePoolTable.STORAGE_POOL;

	/**
	 * The table cattle.storage_pool_host_map
	 */
	public static final io.cattle.platform.core.model.tables.StoragePoolHostMapTable STORAGE_POOL_HOST_MAP = io.cattle.platform.core.model.tables.StoragePoolHostMapTable.STORAGE_POOL_HOST_MAP;

	/**
	 * The table cattle.subnet
	 */
	public static final io.cattle.platform.core.model.tables.SubnetTable SUBNET = io.cattle.platform.core.model.tables.SubnetTable.SUBNET;

	/**
	 * The table cattle.subnet_vnet_map
	 */
	public static final io.cattle.platform.core.model.tables.SubnetVnetMapTable SUBNET_VNET_MAP = io.cattle.platform.core.model.tables.SubnetVnetMapTable.SUBNET_VNET_MAP;

	/**
	 * The table cattle.task
	 */
	public static final io.cattle.platform.core.model.tables.TaskTable TASK = io.cattle.platform.core.model.tables.TaskTable.TASK;

	/**
	 * The table cattle.task_instance
	 */
	public static final io.cattle.platform.core.model.tables.TaskInstanceTable TASK_INSTANCE = io.cattle.platform.core.model.tables.TaskInstanceTable.TASK_INSTANCE;

	/**
	 * The table cattle.user_preference
	 */
	public static final io.cattle.platform.core.model.tables.UserPreferenceTable USER_PREFERENCE = io.cattle.platform.core.model.tables.UserPreferenceTable.USER_PREFERENCE;

	/**
	 * The table cattle.vnet
	 */
	public static final io.cattle.platform.core.model.tables.VnetTable VNET = io.cattle.platform.core.model.tables.VnetTable.VNET;

	/**
	 * The table cattle.volume
	 */
	public static final io.cattle.platform.core.model.tables.VolumeTable VOLUME = io.cattle.platform.core.model.tables.VolumeTable.VOLUME;

	/**
	 * The table cattle.volume_storage_pool_map
	 */
	public static final io.cattle.platform.core.model.tables.VolumeStoragePoolMapTable VOLUME_STORAGE_POOL_MAP = io.cattle.platform.core.model.tables.VolumeStoragePoolMapTable.VOLUME_STORAGE_POOL_MAP;

	/**
	 * The table cattle.zone
	 */
	public static final io.cattle.platform.core.model.tables.ZoneTable ZONE = io.cattle.platform.core.model.tables.ZoneTable.ZONE;
}
