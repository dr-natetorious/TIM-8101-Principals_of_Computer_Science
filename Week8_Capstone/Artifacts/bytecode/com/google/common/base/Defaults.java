public final class com.google.common.base.Defaults {
  static {};
    Code:
       0: dconst_0
       1: invokestatic  #16                 // Method java/lang/Double.valueOf:(D)Ljava/lang/Double;
       4: putstatic     #18                 // Field DOUBLE_DEFAULT:Ljava/lang/Double;
       7: fconst_0
       8: invokestatic  #23                 // Method java/lang/Float.valueOf:(F)Ljava/lang/Float;
      11: putstatic     #25                 // Field FLOAT_DEFAULT:Ljava/lang/Float;
      14: return

  public static <T> T defaultValue(java.lang.Class<T>);
    Code:
       0: aload_0
       1: invokestatic  #37                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       4: pop
       5: aload_0
       6: getstatic     #43                 // Field java/lang/Boolean.TYPE:Ljava/lang/Class;
       9: if_acmpne     16
      12: getstatic     #47                 // Field java/lang/Boolean.FALSE:Ljava/lang/Boolean;
      15: areturn
      16: aload_0
      17: getstatic     #50                 // Field java/lang/Character.TYPE:Ljava/lang/Class;
      20: if_acmpne     28
      23: iconst_0
      24: invokestatic  #53                 // Method java/lang/Character.valueOf:(C)Ljava/lang/Character;
      27: areturn
      28: aload_0
      29: getstatic     #56                 // Field java/lang/Byte.TYPE:Ljava/lang/Class;
      32: if_acmpne     40
      35: iconst_0
      36: invokestatic  #59                 // Method java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
      39: areturn
      40: aload_0
      41: getstatic     #62                 // Field java/lang/Short.TYPE:Ljava/lang/Class;
      44: if_acmpne     52
      47: iconst_0
      48: invokestatic  #65                 // Method java/lang/Short.valueOf:(S)Ljava/lang/Short;
      51: areturn
      52: aload_0
      53: getstatic     #68                 // Field java/lang/Integer.TYPE:Ljava/lang/Class;
      56: if_acmpne     64
      59: iconst_0
      60: invokestatic  #71                 // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
      63: areturn
      64: aload_0
      65: getstatic     #74                 // Field java/lang/Long.TYPE:Ljava/lang/Class;
      68: if_acmpne     76
      71: lconst_0
      72: invokestatic  #77                 // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
      75: areturn
      76: aload_0
      77: getstatic     #78                 // Field java/lang/Float.TYPE:Ljava/lang/Class;
      80: if_acmpne     87
      83: getstatic     #25                 // Field FLOAT_DEFAULT:Ljava/lang/Float;
      86: areturn
      87: aload_0
      88: getstatic     #79                 // Field java/lang/Double.TYPE:Ljava/lang/Class;
      91: if_acmpne     98
      94: getstatic     #18                 // Field DOUBLE_DEFAULT:Ljava/lang/Double;
      97: areturn
      98: aconst_null
      99: areturn
}
