package daffodil.section05.dfdl_xsdl_subset

import junit.framework.Assert._
import org.scalatest.junit.JUnitSuite
import org.junit.Test
import scala.xml._
import daffodil.xml.XMLUtils
import daffodil.xml.XMLUtils._
import daffodil.compiler.Compiler
import daffodil.util._
import daffodil.tdml.DFDLTestSuite
import java.io.File

import daffodil.debugger.Debugger

class TestDFDLSubset2 extends JUnitSuite {
  val testDir = "/daffodil/section05/dfdl_xsdl_subset/"
  val tdml = testDir + "DFDLSubset.tdml"
  lazy val runner = new DFDLTestSuite(Misc.getRequiredResource(tdml))

  @Test def test_badGroupRef() { Debugger.withDebugger { runner.runOneTest("badGroupRef") } }
}