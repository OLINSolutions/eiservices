
set @maxId = 0;

-- Preserve Entries
select ifNull(max(idUtoteEntry),0) from utoteEntriesHistory into @maxId;
insert into utoteEntriesHistory select * from utoteEntries where (idUtoteEntry > @maxId);
commit;
-- Remove preserved Entries from daily dable
delete from utoteEntries;
commit;
-- Preserve Runners
select ifNull(max(idUtoteRunner),0) from utoteRunnersHistory into @maxId;
insert into utoteRunnersHistory select * from utoteRunners where (idUtoteRunner > @maxId);
commit;
-- Remove preserved Runners from daily table
delete from utoteRunners;
commit;
-- Preserve Pools
select ifNull(max(idUtotePool),0) from utotePoolsHistory into @maxId;
insert into utotePoolsHistory select * from utotePools where (idUtotePool > @maxId);
commit;
-- Remove preserved Pools from daily table
delete from utotePools;
commit;
-- Preserve Races
select ifNull(max(idUtoteRace),0) from utoteRacesHistory into @maxId;
insert into utoteRacesHistory select * from utoteRaces where (idUtoteRace > @maxId);
commit;
-- Remove preserved Races from daily table
delete from utoteRaces;
commit;
-- Preserve Events
select ifNull(max(idUtoteEvent),0) from utoteEventsHistory into @maxId;
insert into utoteEventsHistory select * from utoteEvents where (idUtoteEvent > @maxId);
commit;
-- Remove preserved Events from daily table
delete from utoteEvents;
commit;

