insert into O_ORGANIZATION(ORG_ID,NAME,CODE, STATUS_CODE)  values('70MM','70MM Entertainments','70MM', 'OK');
insert into O_ORGANIZATION(ORG_ID,NAME,CODE, STATUS_CODE)    values('SSCONST','SS Constructions', 'SSCONST', 'OK');
insert into O_ORGANIZATION(ORG_ID,NAME,CODE, STATUS_CODE)    values('LSUP','Lucid Supplier', 'LSUP', 'OK');

insert into REF_DEPARTMENT  (dept_id, dept_name, dept_desc) values ('DVLP','Development','Development');
insert into REF_DEPARTMENT  (dept_id, dept_name, dept_desc) values ('QA','QA','Quality Assurance');
insert into REF_DEPARTMENT  (dept_id, dept_name, dept_desc) values ('HR','HRDept','Human Resource');


insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('DEVARCH','Architect','F','DVLP');
insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('SRDEV','Senior Developer','F','DVLP');
insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('JRDEV','Junior Developer','F','DVLP');
insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('QAARCH','Architect','F','QA');
insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('SRQA','Senior QA Analyst','F','QA');
insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('JRQA', 'Junior QA Analyst', 'F', 'QA');
insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('HRMGR','HR Manager', 'T', 'HR');
insert into REF_JOB (job_id, job_name, internal_job_ind, dept_id) values('HRREC','HR Recruiter', 'T', 'HR');

insert into REF_WORKERTYPE (worker_type_code, worker_type_name, worker_type_desc) values('W2','W2 Employee','W2 Employee');
insert into REF_WORKERTYPE (worker_type_code, worker_type_name, worker_type_desc) values('C2C','C2C Employee','Corp to Corp');
insert into REF_WORKERTYPE (worker_type_code, worker_type_name, worker_type_desc) values('1099','1099 Employee','Contractor');

insert into t_document_def (doc_def_id,org_id,doc_type,doc_name,doc_internal_code,status,doc_scope) values ('DOC_PASSPORT','70MM','Uploaded','Passport','Passport','1',3);
insert into t_document_def (doc_def_id,org_id,doc_type,doc_name,doc_internal_code,status,doc_scope) values ('DOC_AADHAR','70MM','Uploaded','Aadhar','Aadhar','1',3);
insert into t_document_def (doc_def_id,org_id,doc_type,doc_name,doc_internal_code,status,doc_scope) values ('DOC_DL','70MM','Uploaded','Driving License','DL','1',3);

insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('W2','DOC_PASSPORT');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('W2','DOC_AADHAR');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('W2','DOC_DL');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('C2C','DOC_PASSPORT');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('C2C','DOC_AADHAR');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('C2C','DOC_DL');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('1099','DOC_PASSPORT');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('1099','DOC_AADHAR');
insert into REF_WRKTYPE_DEFDOCS (worker_type_code,doc_def_id) values ('1099','DOC_DL');