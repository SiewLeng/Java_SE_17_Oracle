package q_30.correct;

sealed class Bird {
   public final class Flamingo extends Bird {}   
}

sealed class Monkey {}

non-sealed class EmperorTamarin extends Monkey {}

non-sealed class Mandrill extends Monkey {}

sealed class Friendly extends Mandrill permits Silly {}

final class Silly extends Friendly {}

// non-sealed class EmperorTamarinExtended extends EmperorTamarin {}
class EmperorTamarinExtended extends EmperorTamarin {}
