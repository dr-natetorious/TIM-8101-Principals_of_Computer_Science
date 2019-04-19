# Artifacts for eHealth Cloud Architecture

## General Cloud Design Principals

### Tackling Cloud Security Issues and Forensics Model

Modern medical facilities need to archive enormous amounts of data in the form of:

- Hospital Information Systems
- Patient History Information

These data caches can easily grow into the petabyte sized due to the high resolution of medical imaging and similar lab results.

Aspects of these systems can be protected with classical encryption but consideration is needed handling reputiation scenarios.

The researchers discuss [the inclusion of forensic modeles](CloudForensicModels.pdf) as an extension of both traditional networking and cloud systems.

A lot of those discussions boil down to Authenticate, Authorize, Audit, and encrypt with trusted platform modules (TPM).

Understand the capabilities exposed by the cloud solution provider (eg. Amazon or Microsoft); and how they can be leveraged.

### A Survey on Cloud Security Issues and Techniques

The article enumerates [various challenges](CloudSecuritySurvey.pdf) that must be addressed with proper cloud based design.

They categorize cloud native solutions as being within levels:

- __SaaS__ : Software as a Service
- __PaaS__ : Platform as a Service
- __IaaS__ : Infrastructure as a Service

Different levels will have different strengths and weaknesses. Example: SaaS has a lower maintence overhead than IaaS, but will suffer risks of multi-tenant execution. If an attacker can compromise the hypervisor and gain access to the host, they can access anything that is running on that same physical machine.

Locality of execution can introduce both legal and operational challenges as major cloud providers are global. Storage and compute resources need to be provisioned into specific regions to address these challenges. Example: European data must stay in Europe.

Services within the cloud are also exposed to the Internet and must be addressed with proper firewalling and access control. The article made not mention of virtual private clouds or virtual private networks as attack surface reduction solutions.

Cloud Services must be designed to have Quality of Service (QoS) characteristics: Availability, Reliability, Latency, and Response Time.

## Components and Implementation Considerations of eHealth Care

### eHealth is health care transformation, not “an IT project

The article discusses [a different mindset needed to build eHealth](eHealthBenefits.pdf) systems. The author states that:

1. eHealth support must not be tackled as an “information technology or IT project” but as a means for improving health care service

2. the “solutions” must not be conceived as once and-for-all, but must follow a judicious cost-effective approach of adopting and adapting the technologies and related procedure.

Another challenge with eHealth is coming up with a availability for all patients not only pockets of users. He goes on to suggest that instead of dedicated infrastructure eHealth should be built on existing commodity services. For example use the Internet and tools like WhatsApp.

The author goes on to decribe "HealthNets" (health networks) -- as not needing to be overly ambishious in scope but extensible, so that features and integrations can be added over time. Get the tooling out there and people will use it. They make a comparison to WhatsApp which was simple and available allowing it to grow to 1.6 billion messages per day.

## Security, Privacy, and Reliability

### Block-based Access Control for Blockchain EMR

Researchers are looking at using Blockchain as a representation of the distributed nature of eHealth information.

One of the key challenges is that block chain natively supports data integrity not confidentiallity.

This problem is currently being addressed through the use of PKI services, which are costly and complex for smaller medical officies.

Another challenge is caused by the limited amount of computation on medical IoT devices.

The authors propose a [mechanim where symetric keys are used](BlockchainEMR.pdf) to authenticate to a EMR server, which then returns blocks encrypted with AES().

The clients then decrypt the block in the same manner as normal web traffic.

## International Implementations of eHealth

### eHealth in Denmark: A Case Study

Denmark is [widely seen as a leading country in terms of eHealth integration and healthcare delivery service](Denmark_eHealth.pdf). However it has not reached its full potential due to fragmentation. The fragmentation is caused by the EU having poor guidance which has led to different European nations doing things differently.

They describe eHealth components as:

- Electronic Medical Records (EMR)
- Electronic Health Records  (EHR)
- e-Perscriptions (e-RX)

Denmark declared in 2007 that health care is a basic human right, and that the state government must pay for it. The federal government only pays for chronic long term illnesses. This aligns with a decentralized model of decisions being made at federal, state, and manicipal levels. There are 5 regional states and 98 municipalities (pg 4).

Their model is patients start at general practitioners (GP) who recommend specialist. Since 2004 all GP are required to use 'MedCom' an electroic medical exchange system. MedCom handle collection, query, and notification of patient state changes. MedCom routes roughly 5m messages/month as of 2012.

Message exchange between offices takes place in EDIFACT (legacy) and moving toward Xml standards going forward (FNUXformat (Fælles Nordisk Udvekslingsformat i XML).

The article points out that Denmark is only 5.5 million residents which does simplify the management of the eHealth system. According to [enchantedlearning.com](https://www.enchantedlearning.com/usa/states/population.shtml) this is roughly the size of Colorado or Wisconson. This helps to reduce the scalability issues and promote consistency across a smaller population.

Key Failures along the way:

- G-EPJ: Attempted to unify all EMR systems, lacked unanomous support and was overly complex. Stepping stones along the way were required.
- National PatientIndex: EHR system that was significantly underfunded leading to delays and unrealistic timelines.

These challenges reduced the confidence in the govenerments ability to efficiently use resources, and added political baggage for future programs. Another challenge was distruption to the doctoral workflow as the direction changed which further added to political baggage and inefficiences.

### Exploring the feasibility of eHealth solutions to decrease delays in maternal healthcare in remote communities of Ghana

Ghana is a rual nation of 28 million in West Africa with typical household incomes of around 1000 USD/month. The nation has high quality health care and nationalized medical insurance-- but is also challenged with shortages of professionals and equipment.

They looking at [eHealth as a mechansism to address the unequalized access to medical information](Ghana_remote_location_ehealth.pdf), especially in remote areas of the nation.

To gain adoption in these rural areas the systems needed to first interview the inhabitants and find out their religous and ethical requirements. This was similar to the ethical AI discussions of last week -- where proper societal scopes need to be addressed. The effort also ties in with [eHealthBenefits](eHealthBenefits.pdf) article that states `eHealth != IT project`. These are deeply personal systems that need to adhere to those requirements.

Along with societal requirements there were technological challenges, the most obvious being network connectivity. For eHealth to succeed the article sites a need for:

- Content : A lack of standards and consistent procedures led to radically different experiences between locations
- Connectivity : Wired cables are unlikely to ever be laid, the system must be built for wirelss and mobile access
- Capcaity : The physical infrastructure and its ability to support the transfer of data
- Community : Low educational resources and strong community identities
- Context : The nation is hot, humid, povertity stricken; with limited access to food and electricity

Having these components provided a framework to begin studying why maternal deaths were so high, and the source of the delays before seeking medical attention.

![Ghana eHealth Model](Ghana_eHealthModel.png)

## Applications within eHealth