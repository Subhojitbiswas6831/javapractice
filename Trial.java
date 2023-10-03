
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.RenderingHints.Key;
import java.awt.print.Printable;
import java.lang.invoke.StringConcatFactory;
import java.lang.ref.Reference;
import java.security.DrbgParameters.NextBytes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import javax.swing.Box.Filler;
import javax.annotation.Untainted;
import javax.swing.RepaintManager;

import org.checkerframework.checker.signature.qual.BinaryNameOrPrimitiveType;
import org.checkerframework.checker.signature.qual.BinaryNameWithoutPackage;
import org.checkerframework.checker.signedness.qual.SignednessBottom;
import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v109.audits.Audits;
import org.openqa.selenium.devtools.v109.css.model.Value;
import org.openqa.selenium.devtools.v109.debugger.model.BreakpointId;
import org.openqa.selenium.devtools.v109.dom.DOM.EnableIncludeWhitespace;
import org.openqa.selenium.devtools.v109.tethering.Tethering;

import io.opentelemetry.semconv.trace.attributes.SemanticAttributes.FaasTriggerValues;

public class Trial {
	public static void main(String[] args) {
		String s1= "string";
		String s2 = "words";
		
		String s3= s1+s2;
		
		s2 = s3.substring(0, s1.length());
		s1 = s3.substring(s2.length(),s3.length());
		
		System.out.println(s2);
		
		//hashmaps insert subject makrs with students and add average
		
		Map<Integer , String> m = new HashMap<>();
		m.put(99, "raghv");
		m.put(88, "pranay");
		for(Map.Entry<Integer,String>e: m.entrySet()) {
			System.out.println(e);
		}
		int avg = 0;
		int count = 0;
		
		Set<Integer>k = m.keySet();
		for(Integer i:k) {
			count++;
			avg+=i;
		}
		System.out.println(avg/count);
	}
}