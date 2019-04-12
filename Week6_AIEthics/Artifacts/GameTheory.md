# Game theory and Decision Processes

These artifacts focus on the patterns and algorithms required to derive ethical AI decisions.

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

## How Moral Codes Evolve in a Trust Game

The [MDPI Games Journal](Artifacts/MoralCodes_evolve_TrustGame.pdf) is a quarterly publication on game theory. Elsner modified the classic prisoners delimma to include:

- Ability for Trustor to punishment the Trustee for violating the moral code
- Limited visibility into the Trustee's actions
- Porpotional pain to the Trustor for publishing the Trustee

The author demostrated that adding a moral code can help sustain the trust and trustworthiness of both players.

In an multi-agent environment it becomes more efficient for all parties to work together than to become oppressors. The terms of that social contract are expressed as ethics. That would suggest that ethcial AI systems must natively be multi-tenant not noisy neighbors.