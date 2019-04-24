final class com.google.common.base.Enums$StringConverter<T extends java.lang.Enum<T>> extends com.google.common.base.Converter<java.lang.String, T> implements java.io.Serializable {
  com.google.common.base.Enums$StringConverter(java.lang.Class<T>);
    Code:
       0: aload_0
       1: invokespecial #22                 // Method com/google/common/base/Converter."<init>":()V
       4: aload_0
       5: aload_1
       6: invokestatic  #28                 // Method com/google/common/base/Preconditions.checkNotNull:(Ljava/lang/Object;)Ljava/lang/Object;
       9: checkcast     #30                 // class java/lang/Class
      12: putfield      #32                 // Field enumClass:Ljava/lang/Class;
      15: return

  protected java.lang.Object doBackward(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #38                 // class java/lang/Enum
       5: invokevirtual #41                 // Method doBackward:(Ljava/lang/Enum;)Ljava/lang/String;
       8: areturn

  protected java.lang.String doBackward(T);
    Code:
       0: aload_1
       1: invokevirtual #45                 // Method java/lang/Enum.name:()Ljava/lang/String;
       4: areturn

  protected T doForward(java.lang.String);
    Code:
       0: aload_0
       1: getfield      #32                 // Field enumClass:Ljava/lang/Class;
       4: aload_1
       5: invokestatic  #52                 // Method java/lang/Enum.valueOf:(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
       8: areturn

  protected java.lang.Object doForward(java.lang.Object);
    Code:
       0: aload_0
       1: aload_1
       2: checkcast     #55                 // class java/lang/String
       5: invokevirtual #57                 // Method doForward:(Ljava/lang/String;)Ljava/lang/Enum;
       8: areturn

  public boolean equals(java.lang.Object);
    Code:
       0: aload_1
       1: instanceof    #2                  // class com/google/common/base/Enums$StringConverter
       4: ifeq          24
       7: aload_1
       8: checkcast     #2                  // class com/google/common/base/Enums$StringConverter
      11: astore_1
      12: aload_0
      13: getfield      #32                 // Field enumClass:Ljava/lang/Class;
      16: aload_1
      17: getfield      #32                 // Field enumClass:Ljava/lang/Class;
      20: invokevirtual #63                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
      23: ireturn
      24: iconst_0
      25: ireturn

  public int hashCode();
    Code:
       0: aload_0
       1: getfield      #32                 // Field enumClass:Ljava/lang/Class;
       4: invokevirtual #67                 // Method java/lang/Object.hashCode:()I
       7: ireturn

  public java.lang.String toString();
    Code:
       0: new           #70                 // class java/lang/StringBuilder
       3: dup
       4: invokespecial #71                 // Method java/lang/StringBuilder."<init>":()V
       7: astore_1
       8: aload_1
       9: ldc           #73                 // String Enums.stringConverter(
      11: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: pop
      15: aload_1
      16: aload_0
      17: getfield      #32                 // Field enumClass:Ljava/lang/Class;
      20: invokevirtual #80                 // Method java/lang/Class.getName:()Ljava/lang/String;
      23: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      26: pop
      27: aload_1
      28: ldc           #82                 // String .class)
      30: invokevirtual #77                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      33: pop
      34: aload_1
      35: invokevirtual #84                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      38: areturn
}
