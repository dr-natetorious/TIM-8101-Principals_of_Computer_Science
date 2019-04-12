# AI Ethics Artifacts

This folder represents a cache of journals and other resources used during the investigation into this weeks [Assignment](../Assignment.md).

## AI - A New Field of Computer Science Which Any Business Should Consider

The [Economic Sciences Series](AI_NewField_BusinessView.pdf) provides a definition of AI and categorizes difference technology branches into a hierarchy.

There is also discussions around the phases of maturity in business adoption and the most frequent scenarios.

![AI-Hierarchy.png](AI-Hierarchy.png)

## Emerging AI Wellness Landscape: Benefits and Potential Areas of Ethical Concern

The [California Western Law Review](AI_Wellness_Landscape.pdf) discusses areas of wellness that are tangible, intangible, and embedded.

Definitions:

    - Wellness is the holistic health a person; mental, physical, spritual, sexual, etc.
    - Tangible wellness are devices such as smart watches
    - Intangible wellness are virtual assistance, video monitoring, background compute etc.
    - Embedded wellness is the fusing of human to computer; eg wired brains

They discuss the duality of AI technology being both helpful and harmful in the same scenarios. Consider a shut-in that can be comforted by a sex robot. This is positive as they are less lonely, yet more detached from the outside world.

## Doing good vs. Avoiding bad in prosocial choice

The [Journal of Experimental Social Psychology](DoingGood_vs_AvoidingBad.pdf) explores why actors choose to be ethical. They frame the conversation in terms of prosociality.

They propose hypothesis:

    - Desire to reach equality everywhere
    - Giving with desire of reciprocity; eg. tip the bartender for better drinks
    - Gaining utility by doing right; eg. makes you feel positive
    - It is easier to be moral and avoid the consequences

These are framed as positions within the 2x2 matrix:

    - TOG frame: Give – Do Good
    - TOG frame: Give – Avoid Bad
    - TOG frame: Equalize – Do Good
    - TOG frame: Equalize – Avoid Bad

## Ethical Issues of AI in Medicine

The [California Western Law Review](EthicalIssues_AI_Medicine.pdf) explores practical applications of AI such as deep learning on image diagnostics.

### What is the content outline

    - Reliability of prediction
        - Requires big data
        - Challenges with overfitting
        - Missing data points cause incorrect guesses

    - Lack of transparency and evidence
        - Hidden layers of DNN are black box

    - Liability, Security, and Privacy
        - If AI system kills the patient who is liable?
        - Cybersecurity

    - Morality in the future
        - AI surgeries are 2x as long
        - Cost 20% more and high maintence costs
        - Need to justify that expense
        - AI surgery tasks have a 3.7% failure rate, should they not be used until 0%

### Any additional notes

AI is required for medicine as there is too much data for the doctor to keep track of. It is compounded by the sensors and demographics which make certain interactions or or less relevant.

They expect that full surgeries will be automonous versus presently only certain tasks are. The tasks which are automated significantly outperform humans with a mortality rate of 1% vs 8.9%.

The on page 271 the journal makes an argument that until AI reaches 0% failure rate. This is irrational as the humans have a higher failure rate and are continuing to be used.

## Ethical Judgment of Agents' Behaviors in Multi-Agent Systems

The [Interational Conference on Computer Ehtics and Philosophical Enquiry](EthicalJudgement_MultiAgentSystems.pdf) provides patterns for describing morality in terms of set theory for multi-agent environments.

In a `Ethical Judgment Process` an `Awareness Process` is given a decision `W` and needs to determine an `Action` based on `beliefs` and `desires`. The valid `action set` is found from the intersect of `beliefs` and `desires` -- as this leads to some utility and does not compromise the social contracts.

The `action set` is passed through a `Moral Rules Process set`, which flags anything that is illegal or violates social norms. Examples might include (1) killing a person or (2) lying about an event.

The `action set` is passed through a `Rightness process`, needs to apply context to the Morality rule. Telling a lye is immoral however it is better than telling a truth that results in death.

The `action set` is passed through a `Judgment Process`, which adds additional constraints to the applicability of certain moral scores. Should you steal an apple to feed a child? What if that child is not hungry or can afford to buy the apple directly.

    - Blind ethical judgement: No details of other agent provided
    - Partial informed: Some information available
    - Fully informed: All the details are known

Limitations: The article is based on reasoning not emotions, which adds another dimension to the problem set.

## European Perspective on Responsible Computing

The [Communications of the ACM](EuropeanPerspective_ResponsibleComputing.pdf) wrote about the European Commission's [new guidelines](https://ec.europa.eu/digital-single-market/en/news/ethics-guidelines-trustworthy-ai) on responsible AI systems.

"Europe is at the forefront of the regulation and reflections on these issues though its institutional bodies (p84)."

### What are the recommended guidelines

_Human agency and oversight_: AI systems should enable equitable societies by supporting human agency and fundamental rights, and not decrease, limit or misguide human autonomy.

_Robustness and safety_: Trustworthy AI requires algorithms to be secure, reliable and robust enough to deal with errors or inconsistencies during all life cycle phases of AI systems.

_Privacy and data governance_: Citizens should have full control over their own data, while data concerning them will not be used to harm or discriminate against them.

_Transparency_: The traceability of AI systems should be ensured.

_Diversity, non-discrimination and fairness_: AI systems should consider the whole range of human abilities, skills and requirements, and ensure accessibility.

_Societal and environmental well-being_: AI systems should be used to enhance positive social change and enhance sustainability and ecological responsibility.

_Accountability_: Mechanisms should be put in place to ensure responsibility and accountability for AI systems and their outcomes.

This is quoted directly from [engadget](https://www.engadget.com/2019/04/08/eu-ai-ethics-guidelines/).

### What is GDPR

The General Data Protection Regulation is an effort to give individuals control over their personal data and to provide a unifying regulation within the EU for international business.

The first effort was aimed at privacy and offering features such as "right to be forgotten." This is the second phase which is aimed focused on autonomous systems -- anything that can derive context without humans.