create index IX_7355D50 on GB_Entry (groupId, transferId);
create index IX_B5EF5128 on GB_Entry (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_C1EA01AA on GB_Entry (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_57E06955 on GB_Transfer (groupId);
create index IX_DD409DA9 on GB_Transfer (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_DA767A6B on GB_Transfer (uuid_[$COLUMN_LENGTH:75$], groupId);