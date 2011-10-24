JC=javac
CFLAGS=-g
RFLAGS=
SOURCES= \
	ArrayHelper.java \
	Sorter.java \
	SorterTest.java
CLASSES=$(subst .java,.class,$(SOURCES))

all:
	javac $(CFLAGS) $(SOURCES)
	java $(RFLAGS) SorterTest

clean:
	rm -rf $(CLASSES)

.PHONY: all clean
