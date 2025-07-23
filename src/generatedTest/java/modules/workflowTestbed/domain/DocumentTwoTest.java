package modules.workflowTestbed.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class DocumentTwoTest extends AbstractDomainTest<DocumentTwo> {

	@Override
	protected DocumentTwo getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(DocumentTwo.MODULE_NAME, DocumentTwo.DOCUMENT_NAME);
	}
}