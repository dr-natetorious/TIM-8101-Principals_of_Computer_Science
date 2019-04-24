class ryey.easer.plugins.operation.i.a$1 {
  static final int[] a;

  static {};
    Code:
       0: invokestatic  #18                 // Method ryey/easer/plugins/operation/i/b$a.values:()[Lryey/easer/plugins/operation/i/b$a;
       3: arraylength
       4: newarray       int
       6: putstatic     #20                 // Field a:[I
       9: getstatic     #20                 // Field a:[I
      12: getstatic     #23                 // Field ryey/easer/plugins/operation/i/b$a.a:Lryey/easer/plugins/operation/i/b$a;
      15: invokevirtual #27                 // Method ryey/easer/plugins/operation/i/b$a.ordinal:()I
      18: iconst_1
      19: iastore
      20: getstatic     #20                 // Field a:[I
      23: getstatic     #30                 // Field ryey/easer/plugins/operation/i/b$a.b:Lryey/easer/plugins/operation/i/b$a;
      26: invokevirtual #27                 // Method ryey/easer/plugins/operation/i/b$a.ordinal:()I
      29: iconst_2
      30: iastore
      31: return
      32: astore_0
      33: goto          20
      36: astore_0
      37: return
    Exception table:
       from    to  target type
           9    20    32   Class java/lang/NoSuchFieldError
          20    31    36   Class java/lang/NoSuchFieldError
}
